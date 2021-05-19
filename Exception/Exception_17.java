class Test4{
static void commit() {
	Connection conn = tl.get();
	if (conn != null) {
		
			conn.commit();
	}
}
public static void main(String[] args) {
    Test4.commit();
}
}