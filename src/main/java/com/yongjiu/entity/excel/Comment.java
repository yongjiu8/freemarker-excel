package com.yongjiu.entity.excel;

import lombok.Getter;
import lombok.Setter;

/**
 * project cne-power-operation-web
 * description: 单元格注释
 * create: 2020-08-11 17:34
 */
@Getter
@Setter
public class Comment {

	private String author;

	private Data data;

	private Font font;

}