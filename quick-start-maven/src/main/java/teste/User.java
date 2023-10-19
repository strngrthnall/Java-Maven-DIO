package teste;

/**
 * Classe que representa o usuário
 */

public class User {
  private String username;
  private String password;
  private StatusUser status;


  public User(String username, String password, StatusUser status) {
    this.username = username;
    this.password = password;
    this.status = status;
  }

  public String getPassword() {
    return password;
  }
  public StatusUser getStatus() {
    return status;
  }
  public String getUsername() {
    return username;
  }

  /**
   * Desablilita o usuário informdo setando o status DISABLED
   */
  public void diable() { this.status = StatusUser.DISABLED;}

  /**
   * Habilita o usuário informdo setando o status ENABLED
   */
  public void enable() { this.status = StatusUser.ENABLED;}

}
