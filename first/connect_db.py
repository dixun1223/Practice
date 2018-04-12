# coding:utf-8
import pymysql
import json


class OperationMysql:
    def __init__(self):
        self.conn = pymysql.connect(
            host='localhost',
            port=3306,
            user='root',
            passwd='sun312171',
            db='myfistku',
            charset='utf8',
            cursorclass=pymysql.cursors.DictCursor
        )
        self.cur = self.conn.cursor()

    # 查询一条数据
    def search_one(self, sql):
        self.cur.execute(sql)
        result = self.cur.fetchone()
        result = json.dumps(result)
        return result


if __name__ == '__main__':
    op_mysql = OperationMysql()
    res = op_mysql.search_one("select * from web_user")
    print(res)
