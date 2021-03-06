package org.adligo.i.ldap.converters;

import java.util.Date;

import org.adligo.i.util.shared.DateTime;
import org.adligo.i.util.shared.StringUtils;

public class DateAttributeConverter implements I_AttributeConverter<Date, String>{

	@Override
	public String toLdap(Date p) {
		if (p == null) {
			return "";
		}
		long time = p.getTime();
		DateTime dt = new DateTime(time);
		return dt.toString();
	}

	@Override
	public Date toJava(String p) {
		if (StringUtils.isEmpty(p)) {
			return null;
		}
		DateTime dt = new DateTime(p);
		return new Date(dt.getTime());
	}

	@Override
	public Class<Date> getJavaClass() {
		return Date.class;
	}

}
