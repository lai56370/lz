package com.lz.util.pentaho;

import com.google.common.collect.Lists;
import com.lz.util.Strings;
import org.pentaho.reporting.engine.classic.core.DataFactory;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.engine.classic.core.TableDataFactory;
import org.pentaho.reporting.engine.classic.core.util.TypedTableModel;
import org.pentaho.reporting.libraries.resourceloader.Resource;
import org.pentaho.reporting.libraries.resourceloader.ResourceManager;

import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by KangXinghua on 2015/11/15.
 */
public class PentahoReportUtils {
    public static void ReportToPdf(String prptFileName, Map<String, Object> parameters, Collection<?> beanCollection, OutputStream outputStream) throws Exception {
        ReportGenerator reportGenerator = new ReportGenerator();
        final URL reportDefinitionURL = PentahoReportUtils.class.getResource("/prptReport/" + prptFileName);
//        final URL reportDefinitionURL = new java.io.File("E:\\code\\scm\\src\\main\\resources\\prptReport\\" + prptFileName).toURI().toURL();
//        final URL reportDefinitionURL = new java.io.File("E:\\scm\\src\\main\\resources\\prptReport\\" + prptFileName).toURI().toURL();
//        final URL reportDefinitionURL = new java.io.File("E:\\dev\\java\\emis\\scm\\src\\main\\resources\\prptReport\\" + prptFileName).toURI().toURL();
        final ResourceManager resourceManager = new ResourceManager();
        final Resource directly = resourceManager.createDirectly(reportDefinitionURL, MasterReport.class);
        reportGenerator.setReportDefinition((MasterReport) directly.getResource());

        reportGenerator.setReportParameters(parameters);

        TypedTableModel model = new TypedTableModel();
        Boolean isAddColumn = false;
        for (Object object : beanCollection) {
            List<Object> objectList = Lists.newArrayList();
            for (Method method : object.getClass().getMethods()) {
                String methodName = method.getName();
                if (method.getParameterCount() == 0 && methodName.startsWith("get")) {
                    if (!isAddColumn) {
                        methodName = methodName.replace("get", "");
                        methodName = Strings.lowerFirst(methodName);
                        if (!methodName.equals("statusName")) {
                            model.addColumn(methodName, method.getReturnType());
                        }
                    }
                    objectList.add(method.invoke(object));
                }
            }
            model.addRow(objectList.toArray());
            isAddColumn = true;
        }

        TableDataFactory tableDataFactory = new TableDataFactory("typedTableModel", model);

        reportGenerator.setDataFactory(tableDataFactory);

        reportGenerator.generateReport(AbstractReportGenerator.OutputType.PDF, outputStream);
    }

    private static class ReportGenerator extends AbstractReportGenerator {
        private MasterReport reportDefinition;
        private DataFactory dataFactory;
        private Map<String, Object> reportParameters;

        @Override
        public MasterReport getReportDefinition() {
            return reportDefinition;
        }

        public void setReportDefinition(MasterReport reportDefinition) {
            this.reportDefinition = reportDefinition;
        }

        @Override
        public DataFactory getDataFactory() {
            return dataFactory;
        }

        public void setDataFactory(DataFactory dataFactory) {
            this.dataFactory = dataFactory;
        }

        @Override
        public Map<String, Object> getReportParameters() {
            return reportParameters;
        }

        public void setReportParameters(Map<String, Object> reportParameters) {
            this.reportParameters = reportParameters;
        }
    }
}
