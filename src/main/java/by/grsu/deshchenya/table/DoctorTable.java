package by.grsu.deshchenya.table;

import java.util.ArrayList;
import java.util.List;

import by.grsu.deshchenya.datamodel.Doctor;

public class DoctorTable extends AbstractTable<Doctor>{
	private List<Doctor> rows;

	@Override
	public List<Doctor> getRows() {
		if (rows == null) {
			rows = new ArrayList<Doctor>();
		}
		return rows;
	}

	@Override
	public void setRows(List<Doctor> rows) {
		this.rows = rows;
	}
}
