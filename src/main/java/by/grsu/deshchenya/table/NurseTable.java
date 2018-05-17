package by.grsu.deshchenya.table;

import java.util.ArrayList;
import java.util.List;

import by.grsu.deshchenya.datamodel.Nurse;

public class NurseTable extends AbstractTable<Nurse>{
	private List<Nurse> rows;

	@Override
	public List<Nurse> getRows() {
		if (rows == null) {
			rows = new ArrayList<Nurse>();
		}
		return rows;
	}

	@Override
	public void setRows(List<Nurse> rows) {
		this.rows = rows;
	}
}
