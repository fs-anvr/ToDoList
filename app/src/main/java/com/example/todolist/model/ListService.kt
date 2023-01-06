package com.example.todolist.model

interface ListService {

    fun createList(task: TaskList)

    fun getList(id: Int) : Result<TaskList>

    fun getLists() : List<TaskList>

    fun moveList(list: TaskList, moveBy: Int)

    fun changeList(oldValue: TaskList, newValue: TaskList)

    fun deleteList(list : TaskList)

    fun addListener(listener : ListListener)

    fun removeListener(listener : ListListener)
}