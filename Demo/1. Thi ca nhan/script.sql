-- ----------------------------------------------------------------------
-- MySQL Migration Toolkit
-- SQL Create Script
-- ----------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;

CREATE DATABASE IF NOT EXISTS `final_exam`
  CHARACTER SET utf8  COLLATE utf8_general_ci;
USE `final_exam`;
-- -------------------------------------
-- Tables

DROP TABLE IF EXISTS `final_exam`.`apt_account`;
CREATE TABLE `final_exam`.`apt_account` (
  `id` INT(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `fullname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = INNODB;

DROP TABLE IF EXISTS `final_exam`.`apt_movie`;
CREATE TABLE `final_exam`.`apt_movie` (
  `id` INT(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `duration` VARCHAR(45) NULL,
  `image` VARCHAR(100) NULL,
  `rating` DECIMAL(10, 0) NULL,
  `public_year` INT(10) unsigned NULL,
  `category_id` INT(10) unsigned NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_apt_movie_1` (`category_id`)
)
ENGINE = INNODB;

DROP TABLE IF EXISTS `final_exam`.`apt_movie_category`;
CREATE TABLE `final_exam`.`apt_movie_category` (
  `id` INT(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = INNODB;



SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------------------------------------------------
-- EOF

