package action;

import java.util.ArrayList;
import java.util.Scanner;

import bean.Hoa;

public class HoaAction {
	public ArrayList<Hoa> inputData(ArrayList<Hoa> list) {
		Scanner sc = new Scanner(System.in);
		int idHoa = 0, soLuong = 0, n = 0;
		float giaBan = 0;
		String tenHoa = "";
		boolean check = true;
		while (check) {
			try {
				System.out.print("Nhập giá trị số hoa:");
				n = Integer.parseInt(sc.nextLine());
				if (n <= 0) {
					throw new NumberFormatException("Giá trị nhập phải lớn hơn 0.!");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập đúng định dạng số.!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("-----Nhập thông tin hoa -----");
			while (check) {
				try {
					System.out.print("ID Hoa: ");
					idHoa = Integer.parseInt(sc.nextLine());
					if (idHoa <= 0) {
						throw new NumberFormatException("ID phải lớn hơn 0.!");
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("Vui lòng nhập đúng định dạng số.!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.print("Tên Hoa: ");
			tenHoa = sc.nextLine();
			while (check) {
				try {
					System.out.print("Giá Bán: ");
					giaBan = Float.parseFloat(sc.nextLine());
					if (giaBan <= 0) {
						throw new NumberFormatException("Giá bán phải lớn hơn 0.!");
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("Vui lòng nhập đúng định dạng số.!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			while (check) {
				try {
					System.out.print("Số Lượng: ");
					soLuong = Integer.parseInt(sc.nextLine());
					if (soLuong <= 0) {
						throw new NumberFormatException("Số lượng phải lớn hơn 0.!");
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("Vui lòng nhập đúng định dạng số.!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			Hoa listHoa = new Hoa(idHoa, tenHoa, giaBan, soLuong);
			list.add(listHoa);
		}
		return list;
	}

	public static void listSoLuong(ArrayList<Hoa> list) {
		if (list.size() > 0) {
			for (Hoa hoa : list) {
				if (hoa.getSoLuong() > 10) {
					System.out.println("===Danh Sách Hoa Có Số Lượng Lớn Hơn 10..!=====");
					System.out.println(hoa);
					System.out.println("---------------------------");
					System.out.println();
				} else {
					System.out.println("Số lượng hoa là: " + hoa.getSoLuong() + " nhỏ hơn 10..!");
				}
			}
		} else {
			System.out.println("Không có dữ liệu");
		}
	}

	public static void listGiaBan(ArrayList<Hoa> list) {
		if (list.size() > 0) {
			for (Hoa hoa : list) {
				if (hoa.getGiaBan() < 100000) {
					System.out.println("===Giá Bán nhỏ hơn 100000.!=====");
					System.out.println(hoa);
					System.out.println("---------------------------");
					System.out.println();
				} else {
					System.out.println("Giá bán là: " + hoa.getGiaBan() + " Lớn hơn 100.000 VNĐ..!");
				}
			}
		} else {
			System.out.println("Không có dữ liệu");
		}
	}
	public static void DisplayData(ArrayList<Hoa> list) {
		if (list.size() > 0) {
			for (Hoa hoa : list) {
				System.out.println("====Danh sách Hoa====");
				System.out.println(hoa);
				System.out.println("-----------------------------");
			}
		} else {
			System.out.println("Không có dữ liệu");
		}
	}
}
