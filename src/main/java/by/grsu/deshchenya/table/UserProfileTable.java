package by.grsu.deshchenya.table;

import java.util.ArrayList;
import java.util.List;

import by.grsu.deshchenya.datamodel.Patient;
import by.grsu.deshchenya.datamodel.UserProfile;

public class UserProfileTable extends AbstractTable<UserProfile> {
	
	private List<UserProfile> rows;

	@Override
	public List<UserProfile> getRows() {
		if (rows == null) {
			rows = new ArrayList<UserProfile>();
		}
		return rows;
	}

	@Override
	public void setRows(List<UserProfile> rows) {
		this.rows = rows;
	}
}