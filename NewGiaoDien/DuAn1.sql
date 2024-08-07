USE [master]
GO
/****** Object:  Database [DuAn2]    Script Date: 11/03/2024 13:29:58 ******/
CREATE DATABASE [DuAn2]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'DuAn2', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER1111\MSSQL\DATA\DuAn2.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'DuAn2_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER1111\MSSQL\DATA\DuAn2_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [DuAn2] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DuAn2].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DuAn2] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [DuAn2] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [DuAn2] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [DuAn2] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [DuAn2] SET ARITHABORT OFF 
GO
ALTER DATABASE [DuAn2] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [DuAn2] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [DuAn2] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [DuAn2] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [DuAn2] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [DuAn2] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [DuAn2] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [DuAn2] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [DuAn2] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [DuAn2] SET  ENABLE_BROKER 
GO
ALTER DATABASE [DuAn2] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [DuAn2] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [DuAn2] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [DuAn2] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [DuAn2] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [DuAn2] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [DuAn2] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [DuAn2] SET RECOVERY FULL 
GO
ALTER DATABASE [DuAn2] SET  MULTI_USER 
GO
ALTER DATABASE [DuAn2] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [DuAn2] SET DB_CHAINING OFF 
GO
ALTER DATABASE [DuAn2] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [DuAn2] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [DuAn2] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [DuAn2] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'DuAn2', N'ON'
GO
ALTER DATABASE [DuAn2] SET QUERY_STORE = ON
GO
ALTER DATABASE [DuAn2] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [DuAn2]
GO
/****** Object:  Table [dbo].[ChatLieu]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChatLieu](
	[ID] [varchar](50) NOT NULL,
	[TenCL] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GiamGia]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GiamGia](
	[MaGG] [varchar](15) NOT NULL,
	[Ten] [nvarchar](40) NULL,
	[GiaTri] [float] NULL,
	[NgayBatDau] [date] NULL,
	[NgayHetHan] [date] NULL,
	[GhiChu] [nvarchar](60) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaGG] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[IDHD] [varchar](50) NOT NULL,
	[MaND] [varchar](50) NULL,
	[MaKH] [varchar](30) NULL,
	[MaHD] [varchar](30) NULL,
	[NgayTao] [date] NULL,
	[TrangThai] [bit] NULL,
	[TongTien] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[ID] [varchar](50) NOT NULL,
	[IDHD] [varchar](50) NULL,
	[IDSPCT] [varchar](50) NULL,
	[SoLuong] [int] NULL,
	[DonGia] [float] NULL,
	[ThanhTien] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [varchar](30) NOT NULL,
	[HoTen] [nvarchar](40) NULL,
	[NgaySinh] [date] NULL,
	[GioiTinh] [nvarchar](10) NULL,
	[DiaChi] [nvarchar](60) NULL,
	[SDT] [varchar](15) NULL,
	[Email] [varchar](30) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MauSac]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MauSac](
	[ID] [varchar](50) NOT NULL,
	[TenMS] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NguoiDung]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NguoiDung](
	[ID] [varchar](50) NOT NULL,
	[TenDangNhap] [varchar](20) NULL,
	[MatKhau] [varchar](20) NULL,
	[HoTen] [nvarchar](40) NULL,
	[GioiTinh] [nvarchar](10) NULL,
	[NgaySinh] [date] NULL,
	[SDT] [varchar](15) NULL,
	[Email] [varchar](30) NULL,
	[VaiTro] [bit] NULL,
	[DiaChi] [nvarchar](60) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhanLoai]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhanLoai](
	[ID] [varchar](50) NOT NULL,
	[TenPL] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[ID] [varchar](50) NOT NULL,
	[MaSP] [varchar](15) NULL,
	[TenSP] [nvarchar](30) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPhamChiTiet]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPhamChiTiet](
	[ID] [varchar](50) NOT NULL,
	[IDSP] [varchar](50) NULL,
	[IDCL] [varchar](50) NULL,
	[IDPL] [varchar](50) NULL,
	[IDMS] [varchar](50) NULL,
	[IDTH] [varchar](50) NULL,
	[IDXX] [varchar](50) NULL,
	[MaGG] [varchar](15) NULL,
	[KichThuoc] [varchar](15) NULL,
	[KhoiLuong] [float] NULL,
	[SoLuong] [int] NULL,
	[Gia] [float] NULL,
	[MoTa] [nvarchar](60) NULL,
	[Anh] [varchar](300) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThuongHieu]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThuongHieu](
	[ID] [varchar](50) NOT NULL,
	[TenTH] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[XuatXu]    Script Date: 11/03/2024 13:29:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[XuatXu](
	[ID] [varchar](50) NOT NULL,
	[TenXX] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChatLieu] ([ID], [TenCL]) VALUES (N'CL001', N'Da')
INSERT [dbo].[ChatLieu] ([ID], [TenCL]) VALUES (N'CL002', N'Vải')
INSERT [dbo].[ChatLieu] ([ID], [TenCL]) VALUES (N'CL003', N'Cotton')
INSERT [dbo].[ChatLieu] ([ID], [TenCL]) VALUES (N'CL004', N'Lông')
GO
INSERT [dbo].[GiamGia] ([MaGG], [Ten], [GiaTri], [NgayBatDau], [NgayHetHan], [GhiChu], [TrangThai]) VALUES (N'GG001', N'Black Feiday', 30, CAST(N'2023-11-25' AS Date), CAST(N'2023-11-27' AS Date), N'Gi?m 50%', 0)
GO
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [NgaySinh], [GioiTinh], [DiaChi], [SDT], [Email], [TrangThai]) VALUES (N'KH001', N'Nguy?n H?ng Nhung', CAST(N'2004-08-01' AS Date), N'Nữ', N'V?nh Phúc', N'0862443023', N'nhung@gmail', 1)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [NgaySinh], [GioiTinh], [DiaChi], [SDT], [Email], [TrangThai]) VALUES (N'KH002', N'Bùi Hoàng Long', CAST(N'2004-08-01' AS Date), N'Nam', N'Nam Đ?nh', N'0862443023', N'long@gmail', 1)
GO
INSERT [dbo].[MauSac] ([ID], [TenMS]) VALUES (N'MS001', N'Đỏ')
INSERT [dbo].[MauSac] ([ID], [TenMS]) VALUES (N'MS002', N'Đen')
INSERT [dbo].[MauSac] ([ID], [TenMS]) VALUES (N'MS003', N'Xám')
INSERT [dbo].[MauSac] ([ID], [TenMS]) VALUES (N'MS004', N'Nâu')
GO
INSERT [dbo].[NguoiDung] ([ID], [TenDangNhap], [MatKhau], [HoTen], [GioiTinh], [NgaySinh], [SDT], [Email], [VaiTro], [DiaChi], [TrangThai]) VALUES (N'93443C5F-5726-4EE6-B3A6-6E8CED4A6328', N'admin', N'123', N'long', N'0', NULL, NULL, NULL, NULL, NULL, NULL)
GO
INSERT [dbo].[PhanLoai] ([ID], [TenPL]) VALUES (N'PL001', N'Túi đeo chéo')
INSERT [dbo].[PhanLoai] ([ID], [TenPL]) VALUES (N'PL002', N'Túi đưa thư')
INSERT [dbo].[PhanLoai] ([ID], [TenPL]) VALUES (N'PL003', N'Túi Nilon')
INSERT [dbo].[PhanLoai] ([ID], [TenPL]) VALUES (N'PL004', N'Cặp da')
GO
INSERT [dbo].[SanPham] ([ID], [MaSP], [TenSP], [TrangThai]) VALUES (N'366B0A2A-CDD6-4851-9A47-5BE5B211C803', N'SP001', N'Túi đeo 2022', 0)
INSERT [dbo].[SanPham] ([ID], [MaSP], [TenSP], [TrangThai]) VALUES (N'36F70C1A-2091-4BAE-8281-B15FC8ABF614', N'SP002', N'Cặp da cá xấu xí', 0)
INSERT [dbo].[SanPham] ([ID], [MaSP], [TenSP], [TrangThai]) VALUES (N'69DFD5D6-42E7-44F1-A7AC-EBB7AD0DA6B7', N'SP003', N'Túi nilon 2021', 0)
INSERT [dbo].[SanPham] ([ID], [MaSP], [TenSP], [TrangThai]) VALUES (N'AF9FD5D6-42E7-44F1-A7AC-EBB7AD0DA6B7', N'SP004', N'Túi đeo 2023', 0)
GO
INSERT [dbo].[SanPhamChiTiet] ([ID], [IDSP], [IDCL], [IDPL], [IDMS], [IDTH], [IDXX], [MaGG], [KichThuoc], [KhoiLuong], [SoLuong], [Gia], [MoTa], [Anh], [TrangThai]) VALUES (N'SPCT001', N'366B0A2A-CDD6-4851-9A47-5BE5B211C803', N'CL002', N'PL001', N'MS001', N'TH001', N'XX003', N'GG001', N'30x13x50', 0.1, 3, 1000, N'Túi VIP pro Tây Hồ', N'', 0)
INSERT [dbo].[SanPhamChiTiet] ([ID], [IDSP], [IDCL], [IDPL], [IDMS], [IDTH], [IDXX], [MaGG], [KichThuoc], [KhoiLuong], [SoLuong], [Gia], [MoTa], [Anh], [TrangThai]) VALUES (N'SPCT002', N'366B0A2A-CDD6-4851-9A47-5BE5B211C803', N'CL001', N'PL004', N'MS003', N'TH001', N'XX001', NULL, N'35x23x48', 1.9, 6, 3980000, N'Túi xấu xí xù xì', N'', 0)
INSERT [dbo].[SanPhamChiTiet] ([ID], [IDSP], [IDCL], [IDPL], [IDMS], [IDTH], [IDXX], [MaGG], [KichThuoc], [KhoiLuong], [SoLuong], [Gia], [MoTa], [Anh], [TrangThai]) VALUES (N'SPCT003', N'36F70C1A-2091-4BAE-8281-B15FC8ABF614', N'CL001', N'PL002', N'MS001', N'TH002', N'XX002', NULL, N'10x10x10', 0.03, 50, 400, N'Túi đựng rau,thịt,....', N'', 0)
INSERT [dbo].[SanPhamChiTiet] ([ID], [IDSP], [IDCL], [IDPL], [IDMS], [IDTH], [IDXX], [MaGG], [KichThuoc], [KhoiLuong], [SoLuong], [Gia], [MoTa], [Anh], [TrangThai]) VALUES (N'SPCT004', N'69DFD5D6-42E7-44F1-A7AC-EBB7AD0DA6B7', N'CL003', N'PL002', N'MS004', N'TH003', N'XX001', N'GG001', N'45x25x50', 1.2, 9, 139000, N'Túi siêu soft cho các boy', N'', 0)
GO
INSERT [dbo].[ThuongHieu] ([ID], [TenTH]) VALUES (N'TH001', N'Gucci')
INSERT [dbo].[ThuongHieu] ([ID], [TenTH]) VALUES (N'TH002', N'LuonVuiTuoi')
INSERT [dbo].[ThuongHieu] ([ID], [TenTH]) VALUES (N'TH003', N'Adidas')
INSERT [dbo].[ThuongHieu] ([ID], [TenTH]) VALUES (N'TH004', N'Đôn chề')
GO
INSERT [dbo].[XuatXu] ([ID], [TenXX]) VALUES (N'MS004', N'Pháp')
INSERT [dbo].[XuatXu] ([ID], [TenXX]) VALUES (N'XX001', N'Việt Nam')
INSERT [dbo].[XuatXu] ([ID], [TenXX]) VALUES (N'XX002', N'Trung Quốc')
INSERT [dbo].[XuatXu] ([ID], [TenXX]) VALUES (N'XX003', N'Mỹ')
GO
ALTER TABLE [dbo].[ChatLieu] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (newid()) FOR [IDHD]
GO
ALTER TABLE [dbo].[HoaDonChiTiet] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[MauSac] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[NguoiDung] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[PhanLoai] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[SanPhamChiTiet] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[ThuongHieu] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[XuatXu] ADD  DEFAULT (newid()) FOR [ID]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([MaND])
REFERENCES [dbo].[NguoiDung] ([ID])
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK1] FOREIGN KEY([IDHD])
REFERENCES [dbo].[HoaDon] ([IDHD])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK1]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK2] FOREIGN KEY([IDSPCT])
REFERENCES [dbo].[SanPhamChiTiet] ([ID])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK2]
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD FOREIGN KEY([IDCL])
REFERENCES [dbo].[ChatLieu] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD FOREIGN KEY([IDMS])
REFERENCES [dbo].[MauSac] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD FOREIGN KEY([IDPL])
REFERENCES [dbo].[PhanLoai] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD FOREIGN KEY([IDSP])
REFERENCES [dbo].[SanPham] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD FOREIGN KEY([IDTH])
REFERENCES [dbo].[ThuongHieu] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD FOREIGN KEY([IDXX])
REFERENCES [dbo].[XuatXu] ([ID])
GO
ALTER TABLE [dbo].[SanPhamChiTiet]  WITH CHECK ADD FOREIGN KEY([MaGG])
REFERENCES [dbo].[GiamGia] ([MaGG])
GO
USE [master]
GO
ALTER DATABASE [DuAn2] SET  READ_WRITE 
GO
