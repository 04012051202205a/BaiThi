/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class QLKhachHang {
    private ArrayList<KhachHang> dsKhachHang;

    public QLKhachHang() {
        dsKhachHang = new ArrayList<>();
    }

    public void DocKhachHang(String filename) {
        // Xóa danh sách khách hàng cũ
        dsKhachHang.clear();

        try {
            // Đọc file
            ArrayList br = new ArrayList((Collection) new FileReader(filename));
            String line;

            // Đọc từng dòng và lưu vào danh sách
//            while (null != (line = br.readLine())) {
                String[] arr = line.split(";");

                // Kiểm tra số lượng phần tử
                if (arr.length == 5) {
                    KhachHang kh = new KhachHang();
                    kh.setMaso(arr[0]);
                    kh.setHoten(arr[1]);
                    kh.setSohokhau(Integer.parseInt(arr[2]));
                    kh.setChisocu(Double.parseDouble(arr[3]));
                    kh.setChisomoi(Double.parseDouble(arr[4]));
                    dsKhachHang.add(kh);
                } else {
                    System.out.println("Dữ liệu không hợp lệ: " + line);
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File không tìm thấy: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi định dạng số: " + e.getMessage());
        }
    }

    public ArrayList<KhachHang> getDsKhachHang() {
        return dsKhachHang;
    }
}
