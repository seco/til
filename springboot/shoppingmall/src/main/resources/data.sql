-- 사용자
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (1, '서울특별시', '어쩌구', 'a@aa.com', 1, '남', 'shin', 0, '신윤철', '{bcrypt}$2a$10$8EcDedLOUbfMjh2SNMH9Fu.iWnwH6EYtqYgV92pAeZotv0OKXB1dC', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (2, '서울특별시', '저쩌구', 'b@aa.com', 0, '여', 'seo', 0, '홍길동', '{bcrypt}$2a$10$WKJpnzcLtKMJgCP76DhAOeJQcgLkTb580vqUKWfvZERRCI.uNH22W', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (3, '경기도', '성남시', 'c@aa.com', 0, '여', 's', 0, '고길동', '{bcrypt}$2a$10$WKJpnzcLtKMJgCP76DhAOeJQcgLkTb580vqUKWfvZERRCI.uNH22W', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (4, '충북', '청주시', 'd@aa.com', 0, '남', 'd', 0, '김길동', '{bcrypt}$2a$10$WKJpnzcLtKMJgCP76DhAOeJQcgLkTb580vqUKWfvZERRCI.uNH22W', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (5, '충남', '공주시', 'e@aa.com', 0, '남', 'f', 0, '박길동', '{bcrypt}$2a$10$WKJpnzcLtKMJgCP76DhAOeJQcgLkTb580vqUKWfvZERRCI.uNH22W', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (6, '제주', '특별시', 'f@aa.com', 1, '여', 'g', 0, '신길동', '{bcrypt}$2a$10$WKJpnzcLtKMJgCP76DhAOeJQcgLkTb580vqUKWfvZERRCI.uNH22W', 0, '1123');
INSERT INTO member (id, address, address_detail, email, email_reception, gender, login_id, message_reception, name, password, point, zip_code) values (7, '경남', '몰라시', 'g@aa.com', 1, '여', 'e', 0, 'gery', '{bcrypt}$2a$10$WKJpnzcLtKMJgCP76DhAOeJQcgLkTb580vqUKWfvZERRCI.uNH22W', 0, '1123');

INSERT INTO role (id, name) VALUES (1, "USER");
INSERT INTO role (id, name) VALUES (2, "ADMIN");

INSERT INTO member_role(member_id, role_id) VALUES (1, 1);
INSERT INTO member_role(member_id, role_id) VALUES (1, 2);
INSERT INTO member_role(member_id, role_id) VALUES (2, 1);

-- 카테고리
INSERT INTO category(id, name, ordering, parents_id) VALUES (1, '호밀빵', 1, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (2, '통밀빵', 2, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (3, '밀빵', 3, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (4, '보리빵', 4, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (5, '디저트', 5, 0);
INSERT INTO category(id, name, ordering, parents_id) VALUES (6, '100%', 1, 1);
INSERT INTO category(id, name, ordering, parents_id) VALUES (7, '65%', 2, 1);
INSERT INTO category(id, name, ordering, parents_id) VALUES (8, '35%', 3, 1);
INSERT INTO category(id, name, ordering, parents_id) VALUES (9, '100%', 1, 2);
INSERT INTO category(id, name, ordering, parents_id) VALUES (10, '70%', 2, 2);
INSERT INTO category(id, name, ordering, parents_id) VALUES (11, '35%', 3, 2);
INSERT INTO category(id, name, ordering, parents_id) VALUES (12, '식빵', 1, 3);
INSERT INTO category(id, name, ordering, parents_id) VALUES (13, '스콘', 2, 3);
INSERT INTO category(id, name, ordering, parents_id) VALUES (14, '35%', 1, 4);
INSERT INTO category(id, name, ordering, parents_id) VALUES (15, '파운드', 1, 5);
INSERT INTO category(id, name, ordering, parents_id) VALUES (16, '타르트', 2, 5);
INSERT INTO category(id, name, ordering, parents_id) VALUES (17, '쿠키', 3, 5);

-- 상품
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (1, 0, '100%호밀빵플레인927kcal, 100%호밀빵무화과981kcal, 100%호밀빵고구마972kcal', 108, 10800 , '100%호밀빵', 200, now(), 6);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (2, 0, '중량 : 약250g 100g당 열량 : 222kcal', 76, 7600 , '65% 호두 호밀빵', 200, now(), 7);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (3, 0, '중량 : 약480g 100g당 열량 : 209kcal', 92, 9200 , '65% 자연발효 호밀빵', 200, now(), 7);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (4, 0, '중량 : 약480g 100g당 열량 : 209kcal', 82, 8200 , '65% 크랜베리 호밀빵', 200, now(), 7);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (5, 0, '중량 : 약260g 100g당 열량 : 222kcal', 64, 6400 , '35% 호두 호밀빵', 200, now(), 8);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (6, 0, '중량 : 약260g 100g당 열량 : 222kcal', 62, 6200 , '35% 고구마 호밀빵', 200, now(), 8);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (7, 0, '중량 : 약260g 100g당 열량 : 222kcal', 72, 7200 , '35% 크랜베리 호밀빵', 200, now(), 8);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (8, 0, '중량 : 1개당 약90g 100g당 열량 : 226kcal', 118, 11800 , '35% 호두 호밀 베이글(5개묶음)', 200, now(), 8);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (9, 0, '중량 : 약160g 100g당 열량 : 268kcal', 38, 3800 , '소프트 소보로 호밀빵', 200, now(), 8);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (10, 0, '중량 : 1개당 약90g 100g당 열량 : 226kcal', 130, 13000 , '35% 크랜베리 호밀 베이글(5개묶음)', 200, now(), 8);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (11, 0, '중량 : 1개당 약80g 8개 한세트 1개당 열량 : 174kcal', 135, 13500 , '100% 검은콩 통밀 베이글 (8개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (12, 0, '통말식빵 대 - 중량:600g 열량: 200kcal/100g. 95 kcal/식빵 12등분 1조각 통밀식빵 중 - 400g 열량:200kcal/100g.62kcal/식빵 13등분 1조각', 68, 6800 , '100% 통밀 식빵', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (13, 0, '중량: 1개80g, 1세트8개 열량: 230kcal/100g. 184kcal/1개당', 135, 13500 , '100% 양파 통밀 베이글 (8개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (14, 0, '중량: 1개80g, 1세트8개 열량: 211kcal/100g. 169kcal/1개당', 168, 16800 , '100% 크랜베리 통밀 베이글 (8개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (15, 0, '중량: 1개80g, 1세트8개 열량: 211kcal/100g. 169kcal/1개당', 168, 16800 , '100% 크랜베리 통밀 베이글 (8개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (16, 0, '중량: 1개80g, 1세트8개 열량: 200kcal/100g. 160kcal/1개당', 108, 10800 , '100% 통밀 베이글 플레인 (8개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (17, 0, '중량 : 1개당 약580g 100g당 열량 : 218kcal', 96, 9600 , '100% 검은콩 통밀식빵', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (18, 0, '100%통밀빵초코 : 650kcal/280g', 78, 7800 , '100% 초코 통밀빵', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (19, 0, '중량: 1개240g, 2개 1세트 열량: 221kcal/100g. 530/1개당', 139, 13900 , '100% 무화과 통밀빵 (2개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (20, 0, '중량: 1개80g, 1세트8개 열량: 231kcal/100g. 185kcal/1개당', 169, 16900 , '100% 호두 통밀 베이글 (8개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (21, 0, '중량: 1개80g, 1세트8개 열량: 208kcal/100g. 172kcal/1개당', 145, 14500 , '100% 시나몬 통밀 베이글 (8개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (22, 0, '중량: 1개90g, 3개 1세트 열량: 238kcal/100g. 214kcal/1개당', 96, 9600 , '100% 통밀 부시맨 브레드(3개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (23, 0, '중량: 1개35g, 1세트7개 열량: 221kcal/100g. 79kcal/1개', 108, 10800 , '100% 통밀 땅콩 버터 모닝빵 (7개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (24, 0, '중량: 1개90g, 3개 1세트 열량:286kcal/1개', 159, 15900 , '100% 초코 검은콩 통밀머핀 (3개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (25, 0, '중량: 1개90g, 3개 1세트 열량:277kcal/1개', 149, 14900 , '100% 검은콩 통밀머핀 (3개 한세트)', 200, now(), 9);
INSERT INTO product (id, cutting, nutrient, point, price, product_name, quantity, registration_date,  category_id) values (26, 0, '중량 : 1개당 약90g 4개 한세트 1개당 열량 : 209kcal', 156, 15600 , '100% 통밀 팥앙금빵 (4개 한세트)', 200, now(), 9);

-- 상품의 옵션
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (1, 0, '호밀빵100%플레인', 6);
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (2, 2100, '호밀빵100%무화과', 6);
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (3, 2000, '호밀빵100%고구마', 6);
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (4, 0, '통밀식빵중(400g)', 12);
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (5, 4000, '통밀식빵대(600g)', 12);
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (6, 0, '검은콩통밀식빵중(450g)', 17);
INSERT INTO product_option (id, additional_price, option_name, product_id) VALUES (7, 3900, '검은콩통밀식빵대(580g)', 17);

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