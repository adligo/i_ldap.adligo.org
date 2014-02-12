package org.adligo.i.ldap;

import java.util.Hashtable;

import org.adligo.i.ldap.models.LdapAttributContext;
import org.adligo.i.log.shared.Log;
import org.adligo.i.log.shared.LogFactory;


public final class ReadOnlyLdapConnection extends LdapConnection {
	private static final Log log = LogFactory.getLog(ReadOnlyLdapConnection.class);
	
	public ReadOnlyLdapConnection(Hashtable<?,?> env, LdapAttributContext ctx) {
		super(env, ctx);
	}

	@Override
	public boolean isReadWrite() {
		return false;
	}
}
