@echo off
echo Building Flutter Web app...

cd /d "d:\MyProject\项目源码\flutter_frontend"

REM 检查是否安装了Flutter
where flutter >nul 2>&1
if %ERRORLEVEL% neq 0 (
    echo Error: Flutter is not installed or not in PATH
    exit /b 1
)

REM 构建Flutter Web应用
flutter pub get
if %ERRORLEVEL% neq 0 (
    echo Error: Failed to get Flutter packages
    exit /b 1
)

flutter build web
if %ERRORLEVEL% neq 0 (
    echo Error: Failed to build Flutter web app
    exit /b 1
)

REM 复制构建产物到Spring Boot静态资源目录
xcopy /E /I /Y "build\web" "..\src\main\resources\static\."

echo Flutter Web app built and copied successfully!
pause