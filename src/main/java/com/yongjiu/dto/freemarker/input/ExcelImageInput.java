package com.yongjiu.dto.freemarker.input;

import lombok.Data;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;

import java.io.Serializable;

@Data
public class ExcelImageInput implements Serializable {

	/**
	 * 图片地址
	 */
	private String imgPath;

	/**
	 * sheet索引
	 */
	private Integer sheetIndex;

	/**
	 * 图片所在位置坐标（xls格式版，HSSFClientAnchor与XSSFClientAnchor只能二选一）
	 */
	private HSSFClientAnchor anchorXls;

	/**
	 * 图片所在位置坐标（xlsx格式版，XSSFClientAnchor与HSSFClientAnchor只能二选一）
	 */
	private XSSFClientAnchor anchorXlsx;

	private ExcelImageInput() {

	}

	/**
	 * Excel图片参数对象(xlsx版)
	 *
	 * @param imgPath
	 * @param sheetIndex
	 * @param anchorXlsx
	 */
	public ExcelImageInput(String imgPath, Integer sheetIndex, XSSFClientAnchor anchorXlsx) {
		this.imgPath = imgPath;
		this.sheetIndex = sheetIndex;
		this.anchorXlsx = anchorXlsx;
	}

	/**
	 * Excel图片参数对象(xls版)
	 *
	 * @param imgPath
	 * @param sheetIndex
	 * @param anchorXls
	 */
	public ExcelImageInput(String imgPath, Integer sheetIndex, HSSFClientAnchor anchorXls) {
		this.imgPath = imgPath;
		this.sheetIndex = sheetIndex;
		this.anchorXls = anchorXls;
	}
}
