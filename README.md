# freemarker-excel
利用freemarker模板导出复杂excel

version：0.0.1

简单使用方法：
使用office软件编写复杂模板 然后导出为xml
将此xml文件 应用到freemarker模板里
我们将自动使用freemarker渲染数据
并读取渲染数据过后的xml文件
使用poi将xml数据导出到新的excel文件

简单实示例：

    FreemarkerInput freemarkerInput = new FreemarkerInput();

    //设置freemarker模板
		freemarkerInput.setTemplateName("templates.ftl");
    
    //设置map数据
		freemarkerInput.setDataMap(getExcelData());
    
    //缓存xml位置
		freemarkerInput.setXmlTempFile("export/temp/");
    
		freemarkerInput.setFileName("cache");
    
		// 导出到项目所在目录下，export文件夹中
		FreemarkerUtils.exportImageExcelNew("export/impress.xlsx", freemarkerInput);
    
