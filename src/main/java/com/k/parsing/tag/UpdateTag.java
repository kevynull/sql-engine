/**
 * 
 */
package com.k.parsing.tag;

import com.k.parsing.command.SetCommand;
import com.k.parsing.command.WhereCommand;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * TODO
 * 
 * @author Kevin.luo
 * @date 2018年1月11日 上午9:59:49
 * 
 */
@XStreamAlias(value = "update")
public class UpdateTag extends CommTag {
	private SetCommand set;
	private WhereCommand where;
	public SetCommand getSet() {
		return set;
	}
	public void setSet(SetCommand set) {
		this.set = set;
	}
	public WhereCommand getWhere() {
		return where;
	}
	public void setWhere(WhereCommand where) {
		this.where = where;
	}
}
