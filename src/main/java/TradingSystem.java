public class TradingSystem {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println("Hệ thống SMARS bắt đầu hoạt động...");
        int receivedFlag = 1; // Giả lập nhận Flag lỗi
        executeOrder(receivedFlag);
    }

    public static void executeOrder(int flag) {
        if (flag == 1) {
            activatePowerPegMode(); // Gọi hàm lẽ ra phải xóa từ 8 năm trước
        }
    }

    private static void activatePowerPegMode() {
        int orders = 0;
        while (true) {
            orders++;
            System.out.println(ANSI_RED + "[CRITICAL] Power Peg Active: Mua co phieu lenh thu " + orders + ANSI_RESET);
            if (orders > 1000) break; // Dừng sau 1000 lệnh giả lập
        }
    }
}