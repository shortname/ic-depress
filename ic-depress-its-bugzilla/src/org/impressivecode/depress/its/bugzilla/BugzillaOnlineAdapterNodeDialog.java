/*
 ImpressiveCode Depress Framework
 Copyright (C) 2013  ImpressiveCode contributors

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.impressivecode.depress.its.bugzilla;

import static org.impressivecode.depress.its.bugzilla.BugzillaOnlineAdapterNodeModel.createDateSettings;
import static org.impressivecode.depress.its.bugzilla.BugzillaOnlineAdapterNodeModel.createLimitSettings;
import static org.impressivecode.depress.its.bugzilla.BugzillaOnlineAdapterNodeModel.createPasswordSettings;
import static org.impressivecode.depress.its.bugzilla.BugzillaOnlineAdapterNodeModel.createProductSettings;
import static org.impressivecode.depress.its.bugzilla.BugzillaOnlineAdapterNodeModel.createURLSettings;
import static org.impressivecode.depress.its.bugzilla.BugzillaOnlineAdapterNodeModel.createUsernameSettings;

import org.impressivecode.depress.its.ITSAuthenticationPane;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponent;
import org.knime.core.node.defaultnodesettings.DialogComponentDate;
import org.knime.core.node.defaultnodesettings.DialogComponentNumberEdit;
import org.knime.core.node.defaultnodesettings.DialogComponentPasswordField;
import org.knime.core.node.defaultnodesettings.DialogComponentString;

/**
 * 
 * @author Marek Majchrzak, ImpressiveCode
 * @author Micha�� Negacz, Wroc�aw University of Technology
 * @author Piotr Wr�blewski, Wroc�aw University of Technology
 * @author Bartosz Skuza, Wroc�aw University of Technology
 * 
 */
public class BugzillaOnlineAdapterNodeDialog extends ITSAuthenticationPane {

	private static final int STRING_FIELD_WIDTH = 32;

	private static final String URL_LABEL = "Bugzilla URL:";

	private static final String PRODUCT_LABEL = "Product:";

	private static final String DATE_FROM_LABEL = "Date from:";

	private static final String LIMIT_LABEL = "Limit:";

	protected BugzillaOnlineAdapterNodeDialog() {
		addDialogComponent(getURLComponent());
		addDialogComponent(getProductComponent());
		addDialogComponent(getDateComponent());
		addDialogComponent(getLimitComponent());
		this.addAuthTab(createUsernameSettings(), createPasswordSettings());
	}

	private DialogComponent getURLComponent() {
		return new DialogComponentString(createURLSettings(), URL_LABEL, true, STRING_FIELD_WIDTH);
	}

	private DialogComponent getProductComponent() {
		return new DialogComponentString(createProductSettings(), PRODUCT_LABEL, true, STRING_FIELD_WIDTH);
	}

	private DialogComponent getDateComponent() {
		return new DialogComponentDate(createDateSettings(), DATE_FROM_LABEL);
	}

	private DialogComponent getLimitComponent() {
		return new DialogComponentNumberEdit(createLimitSettings(), LIMIT_LABEL);
	}

}
