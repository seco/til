# Docker 



---

### 시스템 기반의 기초 지식

1. 클라우드와 온프레미스 

   1. on-premises
      * 자사에서 데이터 센터를 보유하고 시스템 구축부터 운용까지를 모두 수행하는 형태
      * 서버, 네트워크 장비를 모두 자사에서 직접 조달하여 시스템 요구사항에 맞춰 구축
      * 메인 프레임 시대부터 웹 시스템에 이르기까지 수많은 기업에서 채택해 온 형태
   2. public cloud
      * 인터넷을 경유하여 불특정 다수에게 제동되는 클라우드 서비스
      * Iaas 시스템 기반 부분을 이용하는 서비스
   3. private cloud
      * 특정 기업에게만 제공되는 클라우드

2. 미들웨어 

   1. Nginx
      * 오픈소스 웹 서버. 소비 메모리가 적고 리버스 프록시 기능과 로드밸런서 기능도 갖고 있는 것이 특징
   2. 시스템 감시 도구
      * 시스템이 어떤 상태로 가동되고 있는지를 감시
      * 미리 설정한 경계 값을 초과한 경우에 정해진 액션을 실행하는 것
      * Zabbix, Datadog, Mackerel 등이 있다.

3. 인프라 구성 관리

   * 전통적으로 온프레미스 환경에서 관리했으나 클라우드 시스템의 등장과 분산기술 덕분에 인프라 구축방법이 달라짐
   * 인프라 변경 이력을 관리할 필요가 없어짐
   * Immutable Infrastructure : 현재 작동하고 있는 인프라의 상태를 관리하는 형태의 인프라 구조
   * Infrastructure as Code : 인프라 구성을 코드로 관리하는 것
   * Docker에서는 Dockerfile로 인프라 정보를 기술할 수 있음
   * Kubernates : 여러 서버의 관리를 자동화하는 툴

4. CI/CD

   1. CI (Continuous Integration) 
      * 코드를 추가/수정할 때마다 테스트를 실행하고 확실하게 작동하는 코드를 유지하는 방법 
      * 젠킨스(Jenkins)와 같은 통합 툴 사용
   2. CD (Continuous Delevery)
      * 폭포형 애플리케이션 개발(요건정의 -> 설계 -> 코딩 -> 테스트 -> 배포)로 릴리즈하는 것이 아닌 애자일 사용
      * 애자일형 개발 : 짧은 사이클의 개발과 릴리스를 반복함으로써 이용자가 원하는 애플리케이션을 적시에 제공

   ---

   ### 도커파일

1. Docker에서 인프라 구성을 기술한 파일을 'Dockerfile'이라고 한다.

2. 확장자는 필요 없음.

3. Dockerfile에서 사용하는 주요 명령

   * FROM : 베이스 이미지 지정
   * RUN : 명령 실행
   * CMD : 컨테이너 실행 명령
   * LABEL : 라벨 설정
   * EXPOSE : 포트 익스포트(포트 설정)
   * ENV : 환경변수
   * ADD : 파일/디렉토리 추가
   * COPY : 파일 복사
   * ENTRYPOINT : 컨테이너 실행 명령
   * VOLUME : 볼륨 마운트
   * USER : 사용자 지정
   * WORKDIR : 작업 디렉토리
   * ARG : Dockerfile 안의 변수
   * ONBUILD : 빌드 완료 후 실행되는 명령
   * STOPSIGNAL : 시스템 콜 시그널 설정
   * HEALTHCHECK : 컨테이너의 헬스 체크
   * SHELL : 기본 쉘 설정

4. 기본 Dockerfile 예시

   ```dockerfile
   # 베이스 이미지 설정
   FROM centos:centos7
   ```

5. docker build 명령의 실행 예시(sample 디렉토리에 있는 Dockerfile 실행)

```
$ docker build -t sample:1.0 /home/docker/sample
```

6. Dockerfile에서 임의의 파일명 붙이기

```
$ docker build -t sample -f Dockerfile.base .
```

7. Docker 이미지 레이어 구조

```dockerfile
# STEP:1 Ubuntu (베이스 이미지)
FROM ubuntu:latest

# STEP:2 Nginx 설치
RUN apt-get update && apt-get install -y -q ningx

# STEP:3 파일 복사
COPY index.html /usr/share/nginx/html/

# STEP:4 Nginx 시작
CMD ["nginx", "-g", "daemon off;"]
```

8. 