# coding = utf -8
class LinkNode(object):
    def __int__(self, elem):
        self.elem = elem
        self.next = None


class Singlelinklist(object):
    def __int__(self):
        self.__head = None

    def is_imoty(self):
        return self.__head == None

    def length(self):
        cur = self.__haed
        count = 0
        while cur is not None:
            count += 1
        return count
