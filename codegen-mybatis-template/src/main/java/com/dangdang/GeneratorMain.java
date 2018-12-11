package com.dangdang;

import com.dangdang.generator.GeneratorFacade;
import com.dangdang.generator.GeneratorProperties;

/**
 * 
 * @author badqiu
 * @email badqiu(a)gmail.com
 */

public class GeneratorMain {
	/**
	 * 请直接修改以下代码调用不同的方法以执行相关生成任务.
	 */
	public static void main(final String[] args) throws Exception {
		final GeneratorFacade g = new GeneratorFacade();
		g.generateByTable("COURSEWARE_PROJECT_TEMPLATE","CoursewareProjectTemplate");
//		g.generateByTable("learn_report_base","LearnReportBaseModel");
		// 打开文件夹
		Runtime.getRuntime().exec(
				"cmd.exe /c start "
						+ GeneratorProperties.getRequiredProperty("outRoot")
						+ "\\codegen-output");
	}
}
