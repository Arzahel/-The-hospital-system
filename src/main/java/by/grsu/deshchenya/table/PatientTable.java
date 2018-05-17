package by.grsu.deshchenya.table;

import java.util.ArrayList;
import java.util.List;

import by.grsu.deshchenya.datamodel.Patient;

public class PatientTable extends AbstractTable<Patient>{
	private List<Patient> rows;

	@Override
	public List<Patient> getRows() {
		if (rows == null) {
			rows = new ArrayList<Patient>();
		}
		return rows;
	}

	@Override
	public void setRows(List<Patient> rows) {
		this.rows = rows;
	}
}
