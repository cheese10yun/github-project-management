[![Build Status](https://travis-ci.org/cheese10yun/github-project-management.svg?branch=master)](https://travis-ci.org/cheese10yun/github-project-management)
[![Coverage Status](https://coveralls.io/repos/github/cheese10yun/github-project-management/badge.svg)](https://coveralls.io/github/cheese10yun/github-project-management)
[![HitCount](http://hits.dwyl.io/cheese10yun/github-project-management.svg)](http://hits.dwyl.io/cheese10yun/github-project-management)
# 프로젝트 소개
Github를 이용해서 Project Management 하는 방법 및 전체적인 프로세스에 대해서 정리했습니다. **issue 관리, 일정 관리, 코드리뷰, 버그 리포트 등 다양한 일들을 Github 하나에서 다 관리할 수 있고 어느 하나 부족하다고 생각하지 않습니다.** 이미 Remote Repository로 Github를 사용 중 이리 사면 적극 추천해 드립니다.

프로젝트는 지속해서 추가될 예정이라 상단의 Star, Watching 버튼을 클릭하시면 구독 알림 받을 수 있습니다.

# 목차
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
        - [Jetbrains Pull Request](#jetbrains-pull-request)
        - [GitHub Pull Request](#github-pull-request)
        - [Pull Request 작성법](#pull-request-%EC%9E%91%EC%84%B1%EB%B2%95)
        - [Code Review](#code-review)
- [CI & Test Coverage](#ci--test-coverage)
    - [전체 플로우](#%EC%A0%84%EC%B2%B4-%ED%94%8C%EB%A1%9C%EC%9A%B0)
    - [Pull Request & Code Review](#pull-request--code-review)
    - [테스트 커버지리 표시](#%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%BB%A4%EB%B2%84%EC%A7%80%EB%A6%AC-%ED%91%9C%EC%8B%9C)
- [Wiki](#wiki)
    - [Wiki 등록](#wiki-%EB%93%B1%EB%A1%9D)
    - [GitHub 작성](#github-%EC%9E%91%EC%84%B1)
    - [Local 작성](#local-%EC%9E%91%EC%84%B1)
- [ZenHub 사용법](#zenhub-%EC%82%AC%EC%9A%A9%EB%B2%95)
    - [기본 칸반보드](#%EA%B8%B0%EB%B3%B8-%EC%B9%B8%EB%B0%98%EB%B3%B4%EB%93%9C)
    - [Milestone 적극 활용](#milestone-%EC%A0%81%EA%B7%B9-%ED%99%9C%EC%9A%A9)
    - [Epic 적극 활용](#epic-%EC%A0%81%EA%B7%B9-%ED%99%9C%EC%9A%A9)
    - [Issue 연결](#issue-%EC%97%B0%EA%B2%B0)
    - [Filter 기능](#filter-%EA%B8%B0%EB%8A%A5)

<!-- /TOC -->

# 전체 플로우
1. Isuee 발급
2. Issue 작업
3. Pull Request Coide Review 진행
4. Issue 반영

## Issue 발행

### Issue란?
모든것이 이슈라고 볼 수 있습니다. 새로운 추가될 가능, 개선 해야할 가능, 버그 등등 모든것이 이슈라고 볼 수 있습니다. 모든 활동 내역에 대해서 이슈를 등록하고 그 이슈기반으로 작업을 진행하게 됩니다.

이슈를 등록할 때 자주 사용하는 템플릿을 등록해서 사용하는 방법이 효율적입니다. 이슈 템플릿을 등록하는 방법을 소개해드리겠습니다.

### Issue Template

#### Issue Template 등록
![](https://github.com/cheese10yun/github/blob/master/images/issue-template-rg.gif?raw=true)

환경에 앎맞는 Issue Template 생성을 합니다.


#### Issue Template 사용법
![new_issue](https://github.com/cheese10yun/github/blob/master/images/add-new-issue.gif?raw=true)

위에서 등록한 Issue Template 기반으로 이슈를 생성할 수 있습니다.


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

다른 것들은 이해하기 쉬울 텐데 Milestone은 조금 생소할 수 있습니다. Milestone에 간단하게 설명해 드리면 이번 출시 버전이 1.0.0 일 경우 해당 버전이든 이슈(작업) 기능 강화, 새 기능추가, 버그 기타 등등 모든 이슈를 Version 1.0.0 Milestone이라는 항목에 추가하면 위 그림처럼 Version 1.0.0에 대한 전체적인 상황을 한눈에 볼 수가 있는 장점이 있습니다.

### Issue 연동
![intellij-task](https://i.imgur.com/FtO0Xme.png)

만약 Jetbrains의 IDE를 사용하고 계신다면 Task 연동을 통해서 Github와 연동하시는 것을 적극 권장해 드립니다.

### Issue 기반 Bracnh 생성
![issue-base-branch](https://i.imgur.com/R8aFoCL.png)
위에서 언급한 Jetbrains의 Task 연동을 하지 않아도 크게 상관없습니다. Task의 갖는 가장 큰 기능은 Github 이슈 기반으로 Branch를 생성을 쉽게 도와주는 것으로 생각합니다. **즉 Github에서 생성된 Issue 기반으로 Branch를 생성하는 것이 핵심입니다.**

Github Issue는 각자의 유니크한 값인 Issue Number를 갖습니다. 또 그 Iusse Number 기반으로 Branch를 이름을 갖게 하여 해당 Branch의 명확한 작업의 의도를 갖게 할 수 있습니다.

Branch 네이밍을 통해서 해당 작업의 의도를 갖게 하는 것은 한계가 있습니다. 또 동료 개발자들이 정확히 무슨 작업을 하는지도 Branch 네이밍을 통해서 유추해내기도 어렵고, 해당 작업이 반영(머지)될 때 도 마찬가지입니다. 이러한 문제들을 Issue Number 기반으로 Branch를 생성(Issue Number Branch 네이밍에 추가)하면 아주 명확해집니다.

## Pull Request[Code Review]
[issue-1](https://github.com/cheese10yun/github/issues/1)에 대한 풀리퀘스트를 통해서 코드리뷰를 진행해 보겠습니다.

### Jetbrains Pull Request
![intellij-pull-request](https://i.imgur.com/vkNR06g.png)
만약 Jetbrains IDE를 사용하신다면 위 방법 처럼 Pull Request를 하는 방법을 권장드립니다.

### GitHub Pull Request
![github-pull-request](https://i.imgur.com/6bBTJUV.png)

Github Code 텝에서 `New Pull Request` 버튼을 클릭해서 Pull Request를 진행 합니다.

### Pull Request 작성법
![](https://i.imgur.com/3TnHt0c.png)

* 왼쪽 위에 Reviewers 톱니바퀴 버튼을 클릭해서 리뷰어를 지정합니다.
* resolved: #1(해당 Issue Number) 풀리퀘스트 요청하는 이유 즉 무슨 이슈에 대한 작업인지 명시합니다.

`resolved` 키워드를 입력하면 해당 풀리퀘스트가 master Branch에 반영되면 자동으로 close 됩니다. 자동으로 close 되는 것이 싫으시다면 issue: #[해당 Issue Number]를 작성해주세요.

이렇게 Pull Request가 생성되면 새로운 Issue Number가 부여됩니다. **즉 Pull Request도 Issue입니다.**

![issue-pull-request-연결](https://i.imgur.com/skNmpeQ.png)

**반드시 해당 풀리퀘스트가 무슨 이슈에 따른 요청인지 명시하시는 것을 권장합니다.** 그렇게 되면 위 그림처럼 해당 이슈에 #2[방금 요청한 풀리퀘스트]가 연결되어 해당 이슈가 무슨 코드로 인해서 진행됐는지 추적하기 좋습니다.

### Code Review
리뷰어가 요청받은 Pull Request로 가서 `Add your review` 버튼을 클릭합니다.

![리뷰진행](https://i.imgur.com/k11vL5w.png)
소스코드에 대한 질문 등 다양한 comment를 남기는 방식으로 pull reqeust가 진행합니다.

* Approve: 코드에 대한 의문점이 없다면 승인 .
* Comment: 간단한 피드백 제출
* Request changes: 해당 코드에 문제가 있다고 판단되며 코드를 반드시 수정 요구

위 항목은 Comment로 Submit review를 진행했습니다.

![comment-표시](https://i.imgur.com/EHnVEjU.png)
위에서 작성한 comment가 해결됬었다면 `Merge pull request` 버튼을 눌러서 해당 pull request를 반영합니다. 반영이 완료되고 해당 branch가 더는 필요 없다고 판단되시면 `Delete branch` 버튼을 통해서 Remote에 있는 Branch를 삭제할 수 있습니다.

**위에서 작성한 resolved: #1 키워드 덕분에 소스코드가 해당 Branch에 적용됐으니 자동으로 #1에 대한 이슈는 close 처리됩니다.**

# CI & Test Coverage
![](https://i.imgur.com/G5jo0Ty.png)

[GitHub Marketplace](https://github.com/marketplace/category/continuous-integration) Public Repository를 이용하면 대부분 무료로 이용 가능합니다. **본 포스팅에서는  CI는 Travis CI, Test Coverage는 Coveralls를 이용해서 진행하겠습니다.**

전체적인 플로우를 설명하는 것이 목적 이리서 특정 툴에 대한 직접적인 사용법을 다루지는 않겠습니다. 언어의 특성 및 개인에 기호에 맞는 제품을 사용하시면 됩니다.

## 전체 플로우
1. Pull Request 요청 -> Code Review 진행
2. Code Review 완료 -> 특정 Branch에 반영
3. 특정 Branch 수정시 자동 CI Build 작업 진행 -> 테스트 코드 실행
4. 테스트 커버지리 표시

## Pull Request & Code Review
![](https://i.imgur.com/q6HmT7o.png)

별다른 설정을 하지 않았다면 Pull Request를 요청할 경우 Travis에서 자동으로 해당 요청한 코드 기반으로 Build 작업이 진행됩니다. Build가 실패했을 경우는 Pull Request 요청자는 코드를 수정해서 최소한 Build가 된 코드 기반으로 Code Review를 진행하게 해야 됩니다(Build도 안 되는 코드를 리뷰할 이유는 없을 거 같습니다.)

요청받은 Pull Request에 대해서 Code Review 작업을 진행하게 됩니다. Code Review가 완료되면 Merge pull request를 통해서 해당 작업(issue)을 반영합니다.

## 테스트 커버지리 표시
![](https://i.imgur.com/U1ROYeE.png)

위에서 Merge pull request를 통해서 해당 작업(issue)을 반영했다면 Travis가 Build 할 때 작성된 Test Code 기반으로 Coverage 정보를 위처럼 자동으로 코멘드를 추가해줍니다.

누군가가 테스트 코드를 작성하지 않았다면 `Change from base` 항목에서 - 표시가 됩니다. **이렇게 해당 작업마다 커버리지를 표시하는 것이 전체 커버리지를 높이고 그 값을 유지하는 좋은 방법이라고 생각합니다.**

# Wiki
GitHub에서는 기본적인 WIKI 기능을 제공해줍니다. 

## Wiki 등록
![](https://github.com/cheese10yun/github/blob/master/images/wiki.gif?raw=true)

## GitHub 작성
![](https://i.imgur.com/t3LuQsm.png)
GitHub에서 위키를 작성할 수 있습니다.

## Local 작성
![](https://i.imgur.com/Ff6Heeb.png)
**위키를 로컬환경에서 작성해서 Push 할 수 있습니다. 이렇게 사용하시는 것을 추천 드립니다.**


# ZenHub 사용법

![](https://i.imgur.com/F5c78MC.png)

수 많은 이슈들이 발급되면 그것을 한눈에 보는 것은 기존 UI에서는 어렵습니다. 이런 문제를 칸반보드 형식으로 해결해주는 것이 ZenHub 입니다.

![](https://cristinasantamarina.files.wordpress.com/2015/06/zenhub-task-board.png)
Public Repository를 이용 중이라면 무료로 사용 가능합니다. Private Repository는 비용을 지급하셔 야합니다.

물론 GitHub에서 제공해주는 Proeject도 칸반보드를 제공해주어서 대안이 되지만 여러 레파지토리에 대한 표시, 애픽 기능 등 다양한 기능들을 제공해주기 때문에 개인적으로 ZenHub를 추천해 드립니다.

**설치는 크롬 확장도구에서 다운로드 받으실 수 있습니다.**

## 기본 칸반보드
![](https://i.imgur.com/GvP6XPh.png)

기본적인 구조는 New Issue, Icebox, Backlog, In Progress, Review/QA, Done을 갖습니다. 각자 본인의 프로젝트와 성향에 맞게 사용하시면 됩니다. 

저 같은 경우에는 생각나는 모든 것들을 New Issue 항목에 추가하고 우선순위가 낮고 당장 필요 없는 작업은 Icebox, 우선순위가 높은 작업은 Backlog 항목에 넣습니다. 진행 중인 작업은 In Progress 나머지 Review/QA는 Pull Request 항목, Issue가 Close 되면 자동으로 Close으로 가게 됩니다.

**이처럼 모든 항목에 대해서 Issue로 관리하고 해당 Issue Number 기반으로 Branch가 생성되면서 코드리뷰, 반영 작업 사이클이 돌아가는 구조입니다.**

## Milestone 적극 활용
![](https://i.imgur.com/3lDuAxi.png)

ZenHub 사용과 직접적인 기능은 아니지만, Milestone 여러 항목을 만들고 대부분 Icebox에 있는 issue가 아니라면 적절한 Milestone에 위치시키는 것을 권장합니다. 전체적인 작업에 진행 척도를 가시적으로 확인하기 좋은 점, 해당 Milestone(버전)에 추가되는 기능, 강화되는 기능, 수정된 버그 등을 직관적이로 표시 할 수 있습니다. 또 전체 Milestone 진척도를 알 수 있어 남은 시간도 산출하기 좋은 장점이 있습니다.

## Epic 적극 활용
![](https://i.imgur.com/dZhrATb.png)
Epic은 Milestone과 비슷하게 이해하시면 됩니다. 큰 작업(Issue)이 있다면 그 작업(Issue)을 여러 Issue로 등록하고 한 묶음으로 관리하는 것입니다.

Milestone의 장점처럼 작업에 대한 진척도를 가시적으로 표시하는 장점이 있습니다. 또 큰 작업물에 대한 작업은 여러 개발자가 나누어서 하다 보니 내가 그 기능을 작업하기 전에 선행적으로 진행되어야 하는 작업도 있을 수 있습니다. 이런 것들을 대한 피드백을 Epic을 이용하면 관리하기 편합니다.


![](https://i.imgur.com/nIMGciB.png)
해당 Issue를 Epic으로 등록 시킬 경우 Create an epic 버튼을 클릭하면 됩니다.

![](https://i.imgur.com/lN2uziy.png)
Issue를 등록할 때 오른쪽 하단의 Epic에서 등록시킬 수 있습니다.

## Issue 연결

![](https://i.imgur.com/XYa3My3.png)
Connect with an issue 기능을 통해서 이슈끼리 연결을 할 수 있습니다. **위처럼 Pull Request를 할 때 아주 유용하게 사용할 수 있습니다.**

![](https://i.imgur.com/DPrWlUd.png)
Issue 13과 해당 이슈를 작업해서 Pull Request Issue 17 번이 ZenHub 보드에서 연결돼 있는 것을 확인 할 수 있습니다. **이처럼 연관된 작업을 묶어주는 장점이 있습니다.**

## Filter 기능

![](https://i.imgur.com/4pZEYsB.png)

다양한 Filter 기능을 제공합니다. Label, Assignee, Milestone, Repo 등등이 있습니다. 해당 기능은 직관적이니
Repo를 제외하고 따로 설명을 진행하지는 않겠습니다.

Repo는 여러 Repo를 한꺼번에 보여줄 수 있습니다. 가령 **Back-end, Front-end Repository가 각각 두 개 이고 그 Repo를 한 보드에 표시할 수 있습니다.** 실무 개발에서는 여러 Repo가 있기 때문에 이것을 한 보드에서 볼 수 있다는 것은 정말 좋은 Filter 기능이라고 생각합니다.
