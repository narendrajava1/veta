package com.veta.helper;

import java.util.Locale;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomPhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {
  @Override
  public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
    return convertToSnakeCase(name);
  }

  @Override
  public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
    return convertToSnakeCase(name);
  }

  private Identifier convertToSnakeCase(Identifier name) {
    if (name == null) {
      return null;
    }
    String newName = name.getText().replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase(Locale.ROOT);
    return Identifier.toIdentifier(newName);
  }
}
