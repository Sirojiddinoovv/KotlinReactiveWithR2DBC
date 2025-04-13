# Kotlin Reactive Web App

Проект на Kotlin с использованием Spring Boot WebFlux и R2DBC для создания реактивного веб-приложения.

## 🛠️ Стек технологий

- [Kotlin](https://kotlinlang.org/) 1.8
- [Spring Boot](https://spring.io/projects/spring-boot) 3.1
- [Spring WebFlux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)
- [R2DBC](https://r2dbc.io/) (реактивная работа с БД)
- [Coroutines + Reactor](https://kotlinlang.org/docs/coroutines-overview.html)
- [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html)

## 🚀 Быстрый старт

1. Клонируй репозиторий:

   ```bash
   git clone https://github.com/your-username/kotlin_reactive.git
   cd kotlin_reactive
   ```

2. Собери проект:

   ```bash
   ./gradlew build
   ```

3. Запусти приложение:

   ```bash
   ./gradlew bootRun
   ```

## 📁 Структура проекта

```
├── build.gradle.kts          // конфигурация Gradle
├── src/main/kotlin           // исходники Kotlin
├── src/main/resources        // application.yml и другие ресурсы
├── .gitignore
└── README.md
```

## ⚙️ Настройки

Убедитесь, что вы настроили подключение к базе данных в `application.yml`, используя R2DBC URL. Пример:

```yaml
spring:
  r2dbc:
    url: r2dbc:postgresql://localhost:5432/mydb
    username: user
    password: pass
```

## 📬 API

Если в проекте настроены эндпоинты, опиши их здесь. Например:

- `GET /users` — получить список пользователей
- `POST /users` — создать нового пользователя

## 📄 Лицензия

Этот проект распространяется под лицензией MIT. См. [LICENSE](LICENSE) для подробностей.
