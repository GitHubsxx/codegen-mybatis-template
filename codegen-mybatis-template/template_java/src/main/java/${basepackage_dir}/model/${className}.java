<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;

import java.io.Serializable;

import lombok.Data;

<#include "/java_imports.include">

/**
 * ${className} Entity.
<#if table.remarks?? && table.remarks != "">
 *${table.remarks}
</#if>
 */
@Data
public class ${className} implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//列信息
	<#list table.columns as column>
	<#if column.remarks?? && column.remarks != "">
	/**
	 * ${column.remarks}
	 */
	</#if>
	private ${column.javaType} ${column.columnNameLower};
	
	</#list>
	
}	