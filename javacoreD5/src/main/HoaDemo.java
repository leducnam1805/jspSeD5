package main;

import java.util.ArrayList;
import java.util.Scanner;

import action.HoaAction;
import bean.Hoa;

public class HoaDemo {

	public static void main(String[] args) {

		ArrayList<Hoa> listHoa = new ArrayList<Hoa>();
		HoaAction objHoa = new HoaAction();
		Scanner sc = new Scanner(System.in);
		objHoa.inputData(listHoa);
		objHoa.DisplayData(listHoa);
		objHoa.listSoLuong(listHoa);
		objHoa.listGiaBan(listHoa);
	}
}
