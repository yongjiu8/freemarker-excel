package com.yongjiu.entity.excel;

import lombok.Data;

import java.util.List;

@Data
public class Row {

	private Integer height;

	private List<Cell> cells;

	private Integer index;

}
