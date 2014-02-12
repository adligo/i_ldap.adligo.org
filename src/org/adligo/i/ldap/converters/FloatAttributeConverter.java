package org.adligo.i.ldap.converters;

import java.math.BigDecimal;

import org.adligo.i.util.shared.StringUtils;

public class FloatAttributeConverter implements I_AttributeConverter<Float, String>{

	@Override
	public String toLdap(Float p) {
		if (p == null) {
			return "";
		}
		return new BigDecimal(p).toPlainString();
	}

	@Override
	public Float toJava(String p) {
		if (StringUtils.isEmpty(p)) {
			return null;
		}
		return Float.parseFloat(p);
	}

	@Override
	public Class<Float> getJavaClass() {
		return Float.class;
	}

}
