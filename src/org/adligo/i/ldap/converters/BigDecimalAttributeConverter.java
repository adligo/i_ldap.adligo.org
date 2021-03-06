package org.adligo.i.ldap.converters;

import java.math.BigDecimal;

import org.adligo.i.util.shared.StringUtils;

public class BigDecimalAttributeConverter implements I_AttributeConverter<BigDecimal, String>{

	@Override
	public String toLdap(BigDecimal p) {
		if (p == null) {
			return "";
		}
		return p.toPlainString();
	}

	@Override
	public BigDecimal toJava(String p) {
		if (StringUtils.isEmpty(p)) {
			return null;
		}
		return new BigDecimal(p);
	}

	@Override
	public Class<BigDecimal> getJavaClass() {
		return BigDecimal.class;
	}

}
