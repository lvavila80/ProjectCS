package com.Project.TecnoWear.infrastructure.adapters;

import com.Project.TecnoWear.Domain.models.AdditionalTaskInfo;
import com.Project.TecnoWear.Domain.ports.out.ExternalServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ExternalServiceAdapter implements ExternalServicePort {


    // https://jsonplaceho.typicode.com/todos/
    // https://jsonplaceho.typicode.com/users/

    private final RestTemplate restTemplate;

    public ExternalServiceAdapter(){
        restTemplate=new RestTemplate();
    }
    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        String apiUrl= "https://jsonplaceho.typicode.com/todos/" + taskId;
        ResponseEntity<JsonPlaceHolderTodo>response=restTemplate.getForEntity(apiUrl,JsonPlaceHolderTodo.class);
       JsonPlaceHolderTodo todo=response.getBody();

       if (todo==null){
           return null;
       }
       apiUrl="https://jsonplaceho.typicode.com/users/"+ todo.getUserId();
       ResponseEntity<JsonPlaceHolderUser>userResponse=restTemplate.getForEntity(apiUrl,JsonPlaceHolderUser.class);
       JsonPlaceHolderUser user= userResponse.getBody();

       if (user==null){
           return null;
       }
       return new AdditionalTaskInfo(user.getId(), user.getName(),user.getEmail());
    }


    private static class JsonPlaceHolderTodo{
        private Long id;
        private Long userId;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }
    }

    private static class JsonPlaceHolderUser{
        private Long id;
        private String name;
        private String email;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

}
