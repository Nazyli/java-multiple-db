# Demo project for Java API - Multiple Data Source
### java-multiple-db

## Environment
* Database MySQL : [Download](src/main/resources/assets/java-multiple-db.sql)

## 📁 Postman Collection
### 🔸  Find All
**End-point: Find All / Method: GET**
>```
>{{base_url}}/rest/students/findAll?page=10&size=10
>```
Query Params
|Param|value|
|---|---|
|page|0|
|size|10|

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
### 🔸  Save

**End-point: Save / Method: POST**
>```
>{{base_url}}/rest/students/save
>```
*Body (**raw**)*

```json
{
  "id": null,
  "name": "Evry Nazyli",
  "nim": "112233",
  "prodi": "Teknik Informatika",
  "address": "Jakarta"
}
```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
