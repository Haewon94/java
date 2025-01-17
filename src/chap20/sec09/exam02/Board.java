package chap20.sec09.exam02;

import java.sql.Blob;
import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private String bfilename;
	private Blob bfiledata;
	private Date bdate;
}
