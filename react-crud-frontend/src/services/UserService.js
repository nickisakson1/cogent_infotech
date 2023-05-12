import axios from 'axios';

const USER_API_BASE_URL = "http://localhost:8080/api/v1/users";

class UserService {

    getUsers(){
        return axios.get(USER_API_BASE_URL, {   
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }

    createUser(user){
        return axios.post(USER_API_BASE_URL, user, {
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }

    getUserById(userId){
        return axios.get(USER_API_BASE_URL + '/' + userId, {
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }

    updateUserById(user, userId){
        return axios.put(USER_API_BASE_URL + '/' + userId, user, {
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }

    deleteUser(userId){
        return axios.delete(USER_API_BASE_URL + '/' + userId, {
            headers: {
            "Access-Control-Allow-Origin" : "*"
            }});
    }
}

export default new UserService()