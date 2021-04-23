package lesson1;

import java.util.Date;

public class Account {
int AccountID;
String Email;
String UserName;
String FullName;
Department DepartmentID;
Position PositionID;
Date CreateDate;
@Override
public String toString() {
	return "Account [AccountID=" + AccountID + ", Email=" + Email + ", UserName=" + UserName + ", FullName=" + FullName
			+ ", DepartmentID=" + DepartmentID + ", PositionID=" + PositionID + ", CreateDate=" + CreateDate + "]";
}

}
