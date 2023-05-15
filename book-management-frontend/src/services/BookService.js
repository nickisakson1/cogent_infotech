import axios from 'axios';

const USER_API_BASE_URL = "http://localhost:8080/api/v1/books";

class BookService {

    getBooks(){
        return axios.get(USER_API_BASE_URL, {   
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }

    createBook(book){
        return axios.post(USER_API_BASE_URL, book, {
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }

    getBookById(bookId){
        return axios.get(USER_API_BASE_URL + '/' + bookId, {
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }

    updateBookById(book, bookId){
        return axios.put(USER_API_BASE_URL + '/' + bookId, book, {
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }

    deleteBook(bookId){
        return axios.delete(USER_API_BASE_URL + '/' + bookId, {
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }
}

export default new BookService()