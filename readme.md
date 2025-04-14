- Check
```bash
curl http://localhost:8080
```

- To launch with reassembly if previously assembled
- Для запуска с пересборкой если ранее уже собиралось
```bash
docker-compose up --build -d
```

- To start with the reassembly of one module if it has already been assembled
- Для запуска с пересборкой одного модуля если ранее уже собиралась
```bash
docker-compose up app1 --build -d
```