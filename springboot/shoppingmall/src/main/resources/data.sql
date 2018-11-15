-- 사용자
INSERT INTO member (index_id, address, address_detail, email, email_reception, gender, id, message_reception, name, password, point, zip_code) values (1, '서울특별시', '어쩌구', 'a@aa.com', 1, '남', 'shin', 0, '신윤철', '111', 0, '1123');
INSERT INTO member (index_id, address, address_detail, email, email_reception, gender, id, message_reception, name, password, point, zip_code) values (2, '서울특별시', '저쩌구', 'b@aa.com', 0, '여', 'seo', 0, '서다인', '111', 0, '1123');

-- 카테고리
INSERT INTO category(id, major, minor) VALUES (1, '호밀빵', '100%');
INSERT INTO category(id, major, minor) VALUES (2, '호밀빵', '65%');
INSERT INTO category(id, major, minor) VALUES (3, '호밀빵', '35%');
INSERT INTO category(id, major, minor) VALUES (4, '통밀빵', '100%');
INSERT INTO category(id, major, minor) VALUES (5, '통밀빵', '65%');
INSERT INTO category(id, major, minor) VALUES (6, '통밀빵', '35%');

-- 상품
INSERT INTO goods (id, cutting, goods_name, nutrient, point, price, quantity, registration_date, category_id) values (1, 0, '100%호밀빵', '100%호밀빵플레인927kcal, 100%호밀빵무화과981kcal, 100%호밀빵고구마972kcal', 216, 10800, 200, now(), 1);
INSERT INTO goods (id, cutting, goods_name, nutrient, point, price, quantity, registration_date, category_id) values (2, 0, '100%검은콩 통밀 베이글', '중량 1개당 80g 8개 한세트', 270, 13500, 200, now(), 4);

-- 상품의 옵션
INSERT INTO goods_option (id, additional_price, option_name, goods_id) VALUES (1, 0, '호밀빵100%플레인', 1);
INSERT INTO goods_option (id, additional_price, option_name, goods_id) VALUES (2, 2100, '호밀빵100%무화과', 1);
INSERT INTO goods_option (id, additional_price, option_name, goods_id) VALUES (3, 2000, '호밀빵100%고구마', 1);

-- 쿠폰
INSERT INTO coupon (id, expiration_date, name, ratio) VALUES (1, '2018-12-31 23:59:59', '10%할인쿠폰!', 10);
INSERT INTO coupon (id, expiration_date, name, ratio) VALUES (2, '2018-12-31 23:59:59', '20%할인쿠폰!', 20);

-- 쿠폰 - 상품 매핑 테이블
INSERT INTO coupon_goods (id, coupon_id, goods_id) VALUES (1, 1, 1);
INSERT INTO coupon_goods (id, coupon_id, goods_id) VALUES (2, 1, 2);
INSERT INTO coupon_goods (id, coupon_id, goods_id) VALUES (3, 1, 3);
INSERT INTO coupon_goods (id, coupon_id, goods_id) VALUES (4, 2, 1);
INSERT INTO coupon_goods (id, coupon_id, goods_id) VALUES (5, 2, 2);
INSERT INTO coupon_goods (id, coupon_id, goods_id) VALUES (6, 2, 3);

-- 쿠폰 - 사용자 매핑 테이블
INSERT INTO coupon_member (id, coupon_id, member_id) VALUES (1, 1, 1);
INSERT INTO coupon_member (id, coupon_id, member_id) VALUES (2, 2, 2);

-- 관심상품리스트
INSERT INTO my_goods_list (id, goods_id, member_id) VALUES (1, 1, 1);
INSERT INTO my_goods_list (id, goods_id, member_id) VALUES (2, 2, 1);
INSERT INTO my_goods_list (id, goods_id, member_id) VALUES (3, 1, 2);
INSERT INTO my_goods_list (id, goods_id, member_id) VALUES (4, 1, 2);

-- 장바구니
INSERT INTO cart (id, goods_name, quantity, goods_id, member_id) VALUES (1, '100%호밀빵', 1, 2, 1);
INSERT INTO cart (id, goods_name, quantity, goods_id, member_id) VALUES (2, '100%호밀빵', 1, 3, 1);

-- 구매정보
INSERT INTO purchase_info (id, member_id) VALUES (1, 1);
INSERT INTO purchase_info (id, member_id) VALUES (2, 1);

-- 결제, 배송, 환불

