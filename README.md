# freemarker-excel

利用freemarker模板导出复杂excel

模板是什么样 导出的就是什么样

不是xml重名xlsx版本

输出真实的xlsx格式excel

office打开不会报错

version：0.0.4

原作者：csdn 大脑补丁

原作者教程：https://blog.csdn.net/x541211190/article/details/105629749

发布修复作者：ZGIT

csdn：https://blog.csdn.net/u014299266

v0.0.4

1.修复读取xml异常

2.修复填充列宽异常

3.修复合并单元格格式异常

4.添加表格填充颜色适配

5.添加文字颜色适配

maven项目引入：

    <dependency>
      <groupId>cn.eonml</groupId>
      <artifactId>freemarker-excel</artifactId>
      <version>0.1.4</version>
    </dependency>

简单使用方法：
使用office软件编写复杂模板 然后导出为xml
将此xml文件 应用到freemarker模板里
我们将自动使用freemarker渲染数据
并读取渲染数据过后的xml文件
使用poi将xml数据导出到新的excel文件

简单实示例：
示例程序：https://github.com/yongjiu8/freemarker-excel-test/tree/master

    FreemarkerInput freemarkerInput = new FreemarkerInput();
        //设置freemarker模板路径
        freemarkerInput.setTemplateFilePath("/templates");
        //模板名字
        freemarkerInput.setTemplateName("template.ftl");
        //缓存xml路径
        freemarkerInput.setXmlTempFile("/templates/tmp");
        //缓存xml名字
        freemarkerInput.setFileName("tmpXml");
        //设置freemarker模板数据
        freemarkerInput.setDataMap(getData());

        //导出Excel到输出流（Excel2003版，xls格式）
        FreemarkerUtils.exportImageExcel("templates/success.xls", freemarkerInput);

        //导出Excel到输出流（Excel2007版及以上，xlsx格式）速度快
        FreemarkerUtils.exportImageExcelNew("templates/success.xlsx", freemarkerInput);

        //导出Excel到浏览器（Excel2003版，xls格式）
        FreemarkerUtils.exportImageExcel(HttpServletResponse , freemarkerInput);

        //导出Excel到浏览器（Excel2007版及以上，xlsx格式）速度快
        FreemarkerUtils.exportImageExcelNew(HttpServletResponse , freemarkerInput);
	 
