package com.mycompany.javakt.views.interfaces;

import java.awt.event.ActionListener;
import java.util.List;

import com.mycompany.javakt.models.NhanVien;
import com.mycompany.javakt.models.PhongBan;

public interface NhanVienView {
  void open();
  void setOnAdd(ActionListener onAdd);
  void setOnEdit(ActionListener onEdit);
  void setOnDelete(ActionListener onDelete);
  void setOnChangePhongBan(ActionListener onChangePhongBan);
  void NapdulieuchoTable(List<NhanVien> list);
  void XoaBang();
  void addRow(NhanVien nv);
  String getIdSelected();
  void initEvents();
  String getTenNV();
  String getMucLuong();
  long getMaPB();
  void initDataCompobox(List<PhongBan> pblist);
  void dispose();
  PhongBan phongBanSelected();
}
