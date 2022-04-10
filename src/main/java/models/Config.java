package models;

import java.sql.SQLException;

      public  class Config {
          public Config() throws SQLException {
          }

          public String getUrl() {
              return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
          }

          public String getUser() {
              return "root";
          }

          public String getPassword() {
              return "codeup";
          }
      }