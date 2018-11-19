-- 사용자
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (1, '서울특별시', '어쩌구', 'a@aa.com', 1, '남', 'shin', 0, '신윤철', '111', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (2, '서울특별시', '저쩌구', 'b@aa.com', 0, '여', 'seo', 0, '홍길동', '111', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (3, '경기도', '성남시', 'c@aa.com', 0, '여', 'seo', 0, '고길동', '111', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (4, '충북', '청주시', 'd@aa.com', 0, '남', 'seo', 0, '김길동', '111', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (5, '충남', '공주시', 'e@aa.com', 0, '남', 'seo', 0, '박길동', '111', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (6, '제주', '특별시', 'f@aa.com', 1, '여', 'seo', 0, '신길동', '111', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (7, '경남', '몰라시', 'g@aa.com', 1, '여', 'seo', 0, 'gery', '111', 0, '1123');

-- 카테고리
INSERT INTO category(id, name, ordering, parents_id) VALUES (1, '호밀빵', 1, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (2, '통밀빵', 2, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (3, '밀빵', 3, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (4, '보리빵', 4, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (5, '디저트', 5, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (6, '100%', 1, 1);
INSERT INTO category(id, name, ordering, parents_id) VALUES (7, '65%', 2, 1);
INSERT INTO category(id, name, ordering, parents_id) VALUES (8, '35%', 3, 1);

-- 상품
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (1, 0, '100%호밀빵플레인927kcal, 100%호밀빵무화과981kcal, 100%호밀빵고구마972kcal', 108, 10800 , '100%호밀빵', 200, now(), 6);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (2, 0, '중량 : 약250g 100g당 열량 : 222kcal', 76, 7600 , '65% 호두 호밀빵', 200, now(), 7);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (3, 0, '중량 : 약480g 100g당 열량 : 209kcal', 92, 9200 , '65% 자연발효 호밀빵', 200, now(), 7);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (4, 0, '중량 : 약480g 100g당 열량 : 209kcal', 82, 8200 , '65% 크랜베리 호밀빵', 200, now(), 7);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (5, 0, '중량 : 약260g 100g당 열량 : 222kcal', 64, 6400 , '35% 호두 호밀빵', 200, now(), 8);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (6, 0, '중량 : 약260g 100g당 열량 : 222kcal', 62, 6200 , '35% 고구마 호밀빵', 200, now(), 8);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (7, 0, '중량 : 약260g 100g당 열량 : 222kcal', 72, 7200 , '35% 크랜베리 호밀빵', 200, now(), 8);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (8, 0, '중량 : 1개당 약90g 100g당 열량 : 226kcal', 118, 11800 , '35% 호두 호밀 베이글(5개묶음)', 200, now(), 8);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (9, 0, '중량 : 약160g 100g당 열량 : 268kcal', 38, 3800 , '소프트 소보로 호밀빵', 200, now(), 8);
INSERT INTO products (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (10, 0, '중량 : 1개당 약90g 100g당 열량 : 226kcal', 130, 13000 , '35% 크랜베리 호밀 베이글(5개묶음)', 200, now(), 8);

-- 상품의 옵션
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (1, 0, '호밀빵100%플레인', 6);
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (2, 2100, '호밀빵100%무화과', 6);
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (3, 2000, '호밀빵100%고구마', 6);

-- 쿠폰
INSERT INTO coupon (id, expiration_date, name, quantity, ratio) VALUES (1, '2018-12-31 23:59:59', '10%할인쿠폰!', 100, 10);
INSERT INTO coupon (id, expiration_date, name, quantity, ratio) VALUES (2, '2018-12-31 23:59:59', '20%할인쿠폰!', 50, 20);
INSERT INTO coupon (id, expiration_date, name, quantity, ratio) VALUES (3, '2018-12-31 23:59:59', '30%할인쿠폰!', 30, 30);
INSERT INTO coupon (id, expiration_date, name, quantity, ratio) VALUES (4, '2018-12-31 23:59:59', '40%할인쿠폰!', 10, 40);

-- 관심상품리스트
INSERT INTO interest_product (id, member_id, product_id) VALUES (1, 1, 1);
INSERT INTO interest_product (id, member_id, product_id) VALUES (2, 1, 2);
INSERT INTO interest_product (id, member_id, product_id) VALUES (3, 1, 3);


-- 쿠폰 - 사용자 매핑 테이블
INSERT INTO member_coupon (member_id, coupon_id) VALUES (1, 1);
INSERT INTO member_coupon (member_id, coupon_id) VALUES (2, 2);


-- 장바구니
INSERT INTO cart_products (id, quantity, member_id, product_id) VALUES (1, 1, 1, 1);
INSERT INTO cart_products (id, quantity, member_id, product_id) VALUES (2, 1, 1, 1);

-- 구매정보
INSERT INTO purchase_info (id, member_id) VALUES (1, 1);
INSERT INTO purchase_info (id, member_id) VALUES (2, 1);

-- 결제
INSERT INTO paying (id, credit, paymenet_date, payment, payment_way, purchase_info_id) VALUES (1, 1, now(), '진행중', '카드', 1);
INSERT INTO paying (id, credit, paymenet_date, payment, payment_way, purchase_info_id) VALUES (2, 0, now(), '진행중', '무통장', 3);
INSERT INTO paying (id, credit, paymenet_date, payment, payment_way, purchase_info_id) VALUES (3, 1, now(), '진행중', '카드', 4);

-- 배송
INSERT INTO delevery (id, location_address, location_name, location_phone_number, delevery_condition, delevery_service_company,delevery_service_number, delvery_date, purchase_info_id) VALUES (1, '서울시', '어쩌구', '0100000000', '배송완료', '한진택배', '01011Fe', now(), 1);
INSERT INTO delevery (id, location_address, location_name, location_phone_number, delevery_condition, delevery_service_company,delevery_service_number, delvery_date, purchase_info_id) VALUES (2, '경기도', '성남시', '01012345678', '배송중', '한진택배', '01011Fe', now(), 1);

-- 환불
INSERT INTO repayment (id, repayment, repayment_date, repayment_reason, purchased_product_id) VALUES (1, 1, now(), '단순변심', 1);
INSERT INTO repayment (id, repayment, repayment_date, repayment_reason, purchased_product_id) VALUES (2, 1, now(), '배송중파손', 1);