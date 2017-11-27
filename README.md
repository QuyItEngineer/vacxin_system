# Đề tài

Ứng dụng hỗ trợ ngươi dùng quản lý phác đồ tiêm chủng cá nhân.


# Phạm vi 

**Đề tài SE10**: Xây dựng hệ thống quản lý tiêm chủng Vaccine cho trung tâm y tế dự phòng.

Trong quỹ thời gian hạn chế thì nhóm chỉ làm một phần trong dự án trên. Đó là phần ứng dụng hỗ trợ ngươi dùng quản lý phác đồ tiêm chủng cá nhân.

# Đối tượng hệ thống

Các đối tượng có trong hệ thống (theo góc nhìn người lập trình) bao gồm:

1) Người dùng 
2) Vaccine (Thuốc tiêm)
3) Phác đồ 
4) Tài khoản 
5) Nhân thân 


# Thiết kế giao diện 

Hệ thống này xây dựng trên nền tảng website và gồm các màn hình chính sau.

1) Trang chủ. 
2) Trang đăng nhập.
3) Trang đăng ký tài khoản.
4) Trang quản lý phác đồ.
5) Trang cập nhật thông tin cá nhân của người dùng.

# Tính năng của ứng dụng 

1) Tạo tài khoản và đăng nhập.
2) Tra cứu thông tin thuốc.
3) Xem phác đồ.
4) Quản lý phác đồ. 
5) Quản lý nhân thân.
6) Người dùng cập nhật thông tin cá nhân.
7) Nhắc nhỏ lịch tiêm chủng.
8) Tham khảo phác đồ tiêm chủng.  


# Đặc tả yêu cầu 

## 1. Tạo tài khoản và đăng nhập 

### Mô tả 

Tính năng này cho phép người dùng tạo tài khoản cá nhân của mình với các dữ liệu là tên tài khoản, địa chỉ email và mật khẩu. Mục đích là để người dùng sử dụng tài khoản này để đăng nhập vào hệ thống và quản lý phác đồ của mình.

### Yêu cầu chức năng 

Yêu cầu thông tin tài khoản cho mỗi người dùng là duy nhất. Địa chỉ email và tài khoản là duy nhất không được trùng lặp.Người dùng có thể đăng nhập bằng tên tài khoản hoặc địa chỉ email đã đăng ký với mật khẩu của mình. 

**Các thông tin yêu cầu cho mỗi tài khoản bao gồm:**

1) Họ và tên
2) Ngày tháng năm sinh
3) Số điện thoại (tuỳ chọn)
4) Địa chỉ email 
5) Cân nặng
6) Mật khẩu 
7) Tên đăng nhập 


## 2. Tra cứu thông tin thuốc  

### Mô tả 

Tính năng này cho phép người dùng nhập từ khóa tên thuốc và hệ thống sẽ truy vấn và trả về các loại vaccine có tên chứa từ khóa đó. Tra cứu thông tin thuốc giúp người dùng biết về giá bán, chỉ định và các lưu ý khi tiêm thuốc. Qua đó giúp người dùng có được những thông tin cần thiết để quyết định tiêm hay không tiêm loại thuốc ấy.

### Yêu cầu chức năng 

**Các thông tin cần có cho mỗi loại vaccine bao gồm **

1) Tên vaccine 
2) Giá bán 
3) Chỉ định và chống chỉ định 
4) Lưu ý 


## 3. Xem phác đồ

### Mô tả 

Tính năng này cho phép người dùng xem được phác đồ tiêm chủng của mình hoặc của nhân thân mình. Các thông tin trong phác đồ cho người dùng biết lịch trình tiêm chủng các nhân của mình, những loại vaccine đã tiêm, chưa tiêm hoặc đã quá hạn tiêm. Từ những thông tin trong phác đồ đó người dùng sẽ có những quyết định tiêm chủng phù hợp.

### Yêu cầu chức năng 

**Các thông tin cần hiển thị trong phác đồ**

1) Tên người được tiêm
2) Tên vaccine 
3) Ngày tiêm 
4) Lần tiêm
5) Tình trạng tiêm (Đã tiêm, chưa tiêm, quá hạn)


## 4. Quản lý phác đồ

### Mô tả 

Tính năng này cho phép người dùng cập nhật lại lịch trình tiêm chủng của mình, bao gồm các chức năng sau 

**1) Thêm mới một mũi tiêm**

Người dùng sẽ chọn loại thuốc và đặt thời gian cần tiêm.

**2) Cập nhật trạng thái mũi tiêm** 

Người dùng sẽ xác định lại trạng thái mũi tiêm này đã tiêm hay chưa hoặc thay đổi lại ngày tiêm. 

### Yêu cầu chức năng 

1) Việc xác định mũi tiêm bị quá hạn được làm bởi hệ thống.
2) Cho phép người dùng thêm các mũi tiêm trong quá khứ và thiết lập trạng thái cho nó ngay như là đã hoàn thành hoặc đã bị trễ hẹn. Mục đích là để người dùng lưu trữ được lịch tiêm trong quá khứ của mình để tiện tra cứu về sau.


## 5. Quản lý nhân thân

### Mô tả 

Tính năng này cho phép người dùng tạo thêm một phác đồ cho người thân của mình trong gia đình. Mục đích để có thể dễ dàng quản lý lịch trình tiêm chủng của nhiều người thân trong một tài khoản duy nhất, giúp thuận tiện hơn cho người sử dụng.

Thông tin của nhân thân mới, được tạo ra bởi người dùng chính, giống với các thông tin được yêu cầu trong phần **thông tin người dùng** tuy nhiên không yêu cầu thông tin tài khoản như tên đăng nhập và mật khẩu. 


### Yêu cầu chức năng 

**1. Khi tạo mới một nhân thân, người dùng phải nhập đủ các thông tin yêu cầu sau đây.** 

1) Họ và tên
2) Ngày tháng năm sinh
3) Số điện thoại (tuỳ chọn)
4) Địa chỉ email (tuỳ chọn)
5) Cân nặng


Trong đó địa chỉ email là tuy chọn, nếu có thì khi nhắc nhở hệ thống sẽ gửi về cho cả người dùng chính và các nhân thân, nếu không hệ thống sẽ gửi lời nhắc về email của người dùng chính.


**2. Nhân thân mới được tạo sẽ có phác đồ riêng của mình.**

Sau khi người dùng tạo thành công nhân thân thành công thì người dùng chính có thể quản lý phác đồ của nhân thân này.

Các nghiệp vụ quản lý phác đồ đã đề cập ở trên.







