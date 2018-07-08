# Github 사용법

## 프로젝트 소개
Project Management Tool 중에서 Trello, JIRA, Redmine 등이 있습니다. 각각의 장단점이 있겠지만 소규모 팀, 간단한 프로젝트, 비공개 프로젝트 등에서 Github를 통해서 Proejct Management를 하는 방법을 소개해 드리겠습니다. **전체적인 사용법을 포스팅할 예정이며 각기 프로젝트에 맞는 방법을 유연하게 사용하시길 권장드립니다.**

지속해서 해당 프로젝트를 이어 나아갈 예정이라 상단의 Star, Watching 버튼을 누르시면 구독 신청받으실 수 있습니다.


## 목차
<!-- TOC -->

- [프로젝트 소개](#%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%86%8C%EA%B0%9C)
- [목차](#%EB%AA%A9%EC%B0%A8)
- [전체 플로우](#%EC%A0%84%EC%B2%B4-%ED%94%8C%EB%A1%9C%EC%9A%B0)
- [Issue 발행](#issue-%EB%B0%9C%ED%96%89)
    - [Issue란?](#issue%EB%9E%80)
    - [Issue Template](#issue-template)
        - [Issue Template 등록](#issue-template-%EB%93%B1%EB%A1%9D)
        - [Issue Template 사용법](#issue-template-%EC%82%AC%EC%9A%A9%EB%B2%95)
        - [Issue Template 파일](#issue-template-%ED%8C%8C%EC%9D%BC)
- [Issue 작업](#issue-%EC%9E%91%EC%97%85)
    - [등록된 issue 살펴 보기](#%EB%93%B1%EB%A1%9D%EB%90%9C-issue-%EC%82%B4%ED%8E%B4-%EB%B3%B4%EA%B8%B0)
    - [Issue 연동](#issue-%EC%97%B0%EB%8F%99)
    - [Issue 기반 Bracnh 생성](#issue-%EA%B8%B0%EB%B0%98-bracnh-%EC%83%9D%EC%84%B1)
- [Pull Request[Code Review]](#pull-requestcode-review)
- [세부 사용법](#%EC%84%B8%EB%B6%80-%EC%82%AC%EC%9A%A9%EB%B2%95)
- [ZenHub 사용법](#zenhub-%EC%82%AC%EC%9A%A9%EB%B2%95)

<!-- /TOC -->
## 전체 플로우 소개

## Issue 발행

### Issue란?
모든것이 이슈라고 볼 수 있습니다. 새로운 추가될 가능, 개선 해야할 가능, 버그 등등 모든것이 이슈라고 볼 수 있습니다. 모든 활동 내역에 대해서 이슈를 등록하고 그 이슈기반으로 작업을 진행하게 됩니다.

이슈를 등록할 때 자주 사용하는 템플릿을 등록해서 사용하는 방법이 효율적입니다. 이슈 템플릿을 등록하는 방법을 소개해드리겠습니다.

### Issue Template

#### Issue Template 등록
![이슈템플릿등록1](https://i.imgur.com/yT8ZVMd.png)

![이슈템플릿등로2](https://i.imgur.com/KTEPgSa.png)

![이슈템플릿등로3](https://i.imgur.com/33inV6l.png)

#### Issue Template 사용법
![new_issue](https://i.imgur.com/MUmUWMF.png)
![bug_report](https://i.imgur.com/e7XFZLt.png)
![bug_report_등록](https://i.imgur.com/UeSSNPd.png)


#### Issue Template 파일

```
.
├── .github
│   └── ISSUE_TEMPLATE
│       ├── bug_report.md
│       └── feature_request.md
├── README.md
├── github.iml
├── images
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
```
위에서 등록된 Issue Template은 .github/ISSUE_TEMPLATE 디렉터리에 생성된 것을 확인할 수 있습니다. 
**각자의 맞는 한경에 따라서 Issue Template를 작성하시면 됩니다.** 저 같은 경우에는 Back-end를 주로 담당하기 때문에 bug tempalte 에서 서버로그, response body 값을 등록했습니다.


## Issue 작업

### 등록된 issue 살펴 보기
![등록된-이슈](https://i.imgur.com/2ciNoCd.png)

* Assignees : 해당 작업의 담당자
* Labels: 해당 작업의 성격
* Milestone: 해당 작업이 속한 파트

![](https://i.imgur.com/DkniJHn.png)

다른 것들은 이해하기 쉬울 텐데 Milestone은 조금 생소할 수 있습니다. Milestone에 간단하게 설명해 드리면 이번 출시 버전이 1.0.0 일 경우 해당 버전이든 이슈(작업) 기능 강화, 새 기능추가, 버그 기타 등등 모든 이슈를 Version 1.0.0 Milestone이라는 항목에 추가하면 위 그림 처럼 Version 1.0.0에 대한 전체적인 상황을 한눈에 볼 수가 있는 장점이 있습니다.


### Issue 연동
![intellij-task](https://i.imgur.com/FtO0Xme.png)
만약 Jetbrains의 IDE를 사용하고 계시다면 Task 연동을 통해서 Github와 연동하시는것을 적극 권장드립니다. 

### Issue 기반 Bracnh 생성
![issue-base-branch](https://i.imgur.com/R8aFoCL.png)
위에서 언급한 Jetbrains의 Task 연동을 하지 않아도 크게 상관없습니다. Task의 갖는 가장 큰 기능은 Github 이슈 기반으로 Branch를 생성을 쉽게 도와주는 것으로 생각합니다. **즉 Github에서 생성된 Issue 기반으로 Branch를 생성하는 것이 핵심입니다.** 

Github Issue는 각자의 유니크한 값인 Issue Number를 갖습니다. 또 그 Iusse Number 기반으로 Branch를 이름을 갖게 하여 해당 Branch의 명확한 작업의 의도를 갖게 할 수 있습니다. 

Branch 네이밍을 통해서 해당 작업의 의도를 갖게 하는 것은 한계가 있습니다. 또 동료 개발자들이 정확히 무슨 작업을 하는지도 Branch 네이밍을 통해서 유추해내기도 어렵고, 해당 작업이 반영(머지)될 때 도 마찬가지입니다. 이러한 문제들을 Issue Number 기반으로 Branch를 생성(Issue Number Branch 네이밍에 추가)하면 아주 명확해집니다.

## Pull Request[Code Review]
[issue-1](https://github.com/cheese10yun/github/issues/1)에 대한 풀리퀘스트를 통해서 코드리뷰를 진행해 보겠습니다. 

## ZenHub 사용법







