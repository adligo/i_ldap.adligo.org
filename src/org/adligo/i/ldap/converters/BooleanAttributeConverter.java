package org.adligo.i.ldap.converters;

import org.adligo.i.util.shared.StringUtils;

public class BooleanAttributeConverter implements I_AttributeConverter<Boolean, String>{

	@Override
	public String toLdap(Boolean p) {
		if (p == null) {
			return "False";
		}
		if (p) {
			return "True";
		}
		return "False";
	}

	@Override
	public Boolean toJava(String p) {
		if (StringUtils.isEmpty(p)) {
			return false;
		}
		if (p.equalsIgnoreCase("True")) {
			return true;
		}
		return false;
	}

	@Override
	public Class<Boolean> getJavaClass() {
		return Boolean.class;
	}

}
