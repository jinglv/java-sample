/*
Navicat MySQL Data Transfer

Source Server         : 59.110.139.20
Source Server Version : 50556
Source Host           : 59.110.139.20:3306
Source Database       : Interfaces

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2018-03-24 21:20:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_case`
-- ----------------------------
DROP TABLE IF EXISTS `t_case`;
CREATE TABLE `t_case` (
  `uuid` varchar(64) NOT NULL,
  `run` varchar(2) DEFAULT NULL,
  `system` varchar(64) DEFAULT NULL,
  `caseName` varchar(64) DEFAULT NULL,
  `method` varchar(64) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `params` longtext,
  `type` varchar(20) DEFAULT NULL,
  `header` varchar(64) DEFAULT NULL,
  `checkpoint` varchar(255) DEFAULT NULL,
  `correlation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_case
-- ----------------------------
INSERT INTO `t_case` VALUES ('653e3a61-5670-4023-85a9-66d0fd95c268', 'Y', '1100071d-7cdf-434a-bb12-601afa3c0768', 'test2', 'post', 'http://59.110.139.20:8080/goods/json2', '{count:2}', 'postjson', 'token=61b3590090982a0185dda9d3bd793b46', '$.data.length()>0', 'name_*=$..name;pwd_*=$..pwd');
INSERT INTO `t_case` VALUES ('653e3a61-5670-4023-85a9-66d0fd95c267', 'Y', '1100071d-7cdf-434a-bb12-601afa3c0768', 'test2', 'post', 'http://59.110.139.20:8080/goods/json2', '{count:3}', 'postjson', 'token=61b3590090982a0185dda9d3bd793b46', '$.data.length()=2', 'name_*=$..name;pwd_*=$..pwd');

-- ----------------------------
-- Table structure for `t_dept`
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `deptid` varchar(64) NOT NULL,
  `deptname` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1100071d-7cdf-434a-bb12-601afa3c0768', '营销', '营销模块');
INSERT INTO `t_dept` VALUES ('12c8a5e5-fe60-449a-9f6c-2d63d316adec', '日志', '营销模块');
INSERT INTO `t_dept` VALUES ('1477cacf-495e-45c7-ae89-8be2f41123ba', '用户系统', '用户模块');
INSERT INTO `t_dept` VALUES ('1dad5e08-a6e8-40ae-9b71-fb3f96619962', '客服', '客服');
INSERT INTO `t_dept` VALUES ('33e9d6cf-4920-4d59-bb9e-b86d06d457c3', '系统模块', '系统模块');

-- ----------------------------
-- Table structure for `t_funcrole`
-- ----------------------------
DROP TABLE IF EXISTS `t_funcrole`;
CREATE TABLE `t_funcrole` (
  `funcroleid` varchar(64) NOT NULL DEFAULT '0',
  `funcid` varchar(64) DEFAULT NULL,
  `roleid` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`funcroleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_funcrole
-- ----------------------------
INSERT INTO `t_funcrole` VALUES ('0009287f-37cf-48bb-9732-01f258a9e05f', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('0190fc9c-4e7c-4c67-851a-0d89d480d54e', '0d505c77-2348-4077-93c8-498585a1c1ac', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('0366f758-9e1d-4403-9bac-a7b05a75840f', '955048f9-1d98-43d5-8c50-28a825d6f079', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('03cb6ced-6209-47fa-a9f2-a6a9d012064f', 'ed582647-db0f-458d-9a8b-6bd0c7864828', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('042197a1-5f0d-4c92-a673-31f4c69df39f', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('04ed2c5a-919b-4bf1-92be-e249db48239f', '82820e9f-3a5e-4e78-8cb5-1c287f6d6244', '238d2ef4-4a00-4851-b719-fcf22968fa51');
INSERT INTO `t_funcrole` VALUES ('052fc14c-b3bf-4321-b829-f085727388cf', '1c1b0c17-af00-4f0f-9273-288e71c8214a', '1');
INSERT INTO `t_funcrole` VALUES ('05970c1f-097f-49a6-9589-2cd22e20e961', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('05f78a8e-82be-4ed3-bbdc-2d6734abf035', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('0677e6d7-b50d-424a-9e36-57cf1dfce88f', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('07069973-8f42-497d-87f1-fd50bcdf1f3b', '58a68c31-7894-4e43-b576-b839e3f7aaa3', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('07325cce-634e-4153-a7dc-948cd91edc09', '9d86c94c-79b6-4f59-8374-b651746139a2', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('073b76ff-c129-4b43-bcc9-df21f6f2878f', 'ed582647-db0f-458d-9a8b-6bd0c7864828', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('07890c7d-0aa6-4103-b20e-e4ad58959b97', '8532a6bc-739e-417c-8525-234317b16654', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('08554fed-26cd-44fb-8bec-430d6856ee6f', '9d86c94c-79b6-4f59-8374-b651746139a2', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('0995ad38-d8f2-439f-a723-b423a84b1869', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', '1');
INSERT INTO `t_funcrole` VALUES ('09b953c6-02d6-47ac-b410-7848feae6701', '8532a6bc-739e-417c-8525-234317b16654', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('0a49a87b-e8ab-45b6-89a5-5365fff866d5', '1', '238d2ef4-4a00-4851-b719-fcf22968fa51');
INSERT INTO `t_funcrole` VALUES ('0a83fa14-036b-4112-b923-8c1c2a459653', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('0aa4b79d-253b-4f8e-8fa0-f2cd4f3dafc1', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('0b89b164-1b5e-4a83-9573-0221a3e8c0d0', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('0bf6b6b7-4a3a-4469-8953-6dff7a0b52e0', '9131b350-0258-45e6-a54e-6cc1a4ebe310', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('0e3f24db-c3e9-482f-88d8-c7361e60cf7d', '592163cc-6836-42d4-b41d-ca824aeef106', '1');
INSERT INTO `t_funcrole` VALUES ('0ea98c95-6a58-4368-973c-9946fc9527c2', '252087d9-c101-44dc-9943-5a275e646bdd', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('10c0cc8d-6c99-41d6-b9a4-f527d9b09d89', '909b6004-1699-46b2-a30a-390c7545638e', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('11666021-180b-4a4d-bdd6-56e39bdd0f56', 'c4cd7878-a890-44b0-96a3-fba609c8dd24', '238d2ef4-4a00-4851-b719-fcf22968fa51');
INSERT INTO `t_funcrole` VALUES ('11d0ab7b-3614-4d42-9498-e2f951490e69', '592163cc-6836-42d4-b41d-ca824aeef106', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('1200074c-466e-48aa-a537-ac301f545428', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('131312e5-3056-4963-a92c-bf414571787f', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('1356372a-3f24-42e0-ab1a-7cd8c19cf21a', '252087d9-c101-44dc-9943-5a275e646bdd', '1');
INSERT INTO `t_funcrole` VALUES ('13cb1cc4-9293-4705-b17d-206b208c94b3', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', '1');
INSERT INTO `t_funcrole` VALUES ('14fad6d8-a09f-48eb-9d35-534f8b58b893', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('15309bd3-3ead-43c9-af6b-3a210289d6f7', '0d505c77-2348-4077-93c8-498585a1c1ac', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('158dc66f-95f8-4c4a-b3d1-e7d25da62dbd', '1cc9445c-b5a2-4cfe-b76c-552781506a89', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('15d56900-5b97-46f7-a0c5-32a710653ce5', 'a150733c-685f-45ba-8bec-d619d6142474', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('1656465f-ebca-4dce-af0b-727062a42b64', '592163cc-6836-42d4-b41d-ca824aeef106', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('165f8286-20b8-4058-ae9b-6b88e05bf089', 'bce5be65-58c0-416e-b96a-c35de480a33b', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('1670674a-aeec-49b3-9596-82da48968cd8', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('1678d82f-8976-4cf3-9222-a11c9c74df9a', '38403cb9-8fe2-4daa-8acc-2091f67a4794', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('16a3568b-5688-43d2-ae26-e712118039ac', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('16b79769-299a-498d-97f6-94069d0d7c3e', '2fd7798c-31c7-4496-812d-f58c5ff30fac', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('17602cc8-443a-4732-96ed-8008c1292bb3', 'f73fd1f9-244e-4257-8e65-f646747a76a6', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('195813ec-5fe6-4033-8752-c18450672e01', '1a3800c0-b68b-4f73-869d-60b925b43bc8', '1');
INSERT INTO `t_funcrole` VALUES ('1a705e42-be36-4ab4-aed1-d819f5141c9c', 'd60d28e6-7c49-4041-a294-fab4bfe29942', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('1b53b44a-a7fd-461a-b6da-ef4f40fb6418', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('1bddc19d-9298-4ff1-a14c-655bbf7ebeb1', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('1ce74462-3b19-4c3a-b2d9-1be65507bf96', '0d505c77-2348-4077-93c8-498585a1c1ac', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('1d7397a0-762a-48f3-9b14-06d1c4f1dfcd', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('1e225179-e86b-4759-89f3-4ebe9aaa5b47', '3ae5aa05-4298-4842-ac4f-3db6a4110213', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('1e3a3a2a-64ca-4cb1-b26c-41a9618dff6b', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('1f5a0e2d-faa8-4618-9da7-53f1d32335dc', '2fd7798c-31c7-4496-812d-f58c5ff30fac', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('1f816d70-045a-40cd-bbee-ca603cda0179', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', '1');
INSERT INTO `t_funcrole` VALUES ('20', '1', '1');
INSERT INTO `t_funcrole` VALUES ('205b69fa-e813-4265-af66-c9fb401f499e', '909b6004-1699-46b2-a30a-390c7545638e', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('207862ad-abc6-498e-8542-426ee4499070', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('20a35e55-e727-49bc-b7a4-33a8508a3689', 'f73fd1f9-244e-4257-8e65-f646747a76a6', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('20ee6e1a-11fb-405a-b3bb-ee0760a0ac78', '909b6004-1699-46b2-a30a-390c7545638e', 'c685f13f-ece2-493a-b06e-87744050b91f');
INSERT INTO `t_funcrole` VALUES ('21d77f74-7676-494c-b116-387f7aa8d567', '1cc9445c-b5a2-4cfe-b76c-552781506a89', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('21ed6394-2619-442c-8475-0fe1cae4e23c', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('21fabece-8c64-435a-98d2-f43a7d2ce519', '1cc9445c-b5a2-4cfe-b76c-552781506a89', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('2218f74b-aa5d-4c01-80f3-5b5defe3860c', '65756748-daf3-4f68-895e-cb21578d6e10', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('222e5314-3f5e-4411-a194-71e02b154ccd', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('2315b611-8d79-427f-b95f-0f5a0398c47e', 'f73fd1f9-244e-4257-8e65-f646747a76a6', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('231f2db0-d777-438c-9eb3-4506ae230a21', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('23acf253-5a0d-4c9a-bfbd-c3e329902755', '991859cf-48c8-462d-8bc1-619413044e0c', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('2420b319-07f0-47c1-afa0-578afdd2edec', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('244fed21-813e-4176-af6f-233cacf68d42', '58a68c31-7894-4e43-b576-b839e3f7aaa3', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('2456a4b7-0545-45d5-8bad-77e98aaab3ee', '85007b42-5000-4f3c-ab06-6db70768d227', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('245f3b88-9b6d-4943-9e99-b1065823e686', '9ef940de-e3e9-4213-8afd-073f94119e7a', '1');
INSERT INTO `t_funcrole` VALUES ('246c768d-288e-4361-a141-7077d6af39d4', '64be2b18-d779-4782-b8ac-134e300c22c2', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('251fb515-6a57-4300-8098-a1e7c37576f4', '85007b42-5000-4f3c-ab06-6db70768d227', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('25b38cfc-0181-4003-881e-f6c58b6247ec', '592163cc-6836-42d4-b41d-ca824aeef106', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('25bef8db-5e19-4d8b-842b-5ba938061126', '3ae4bf79-b65e-4cdc-a110-35ba1fa84e4c', '1');
INSERT INTO `t_funcrole` VALUES ('26005116-294a-46e8-ab8e-0367ecb6a942', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('26081728-2460-4fa6-99f0-27c7e18a47ab', 'a7d02dcb-41d9-4ea4-b0dd-a6a306eef7ef', '48990dc2-019b-4c8e-882f-b90a520c7ab9');
INSERT INTO `t_funcrole` VALUES ('26249d28-493f-49d5-981b-62d3d90b2268', '2fd7798c-31c7-4496-812d-f58c5ff30fac', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('2684adb5-939a-4be5-a8f5-a53b94a1a324', '9d86c94c-79b6-4f59-8374-b651746139a2', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('26ac2839-731e-4a5c-8e40-91ead758b664', '2fd7798c-31c7-4496-812d-f58c5ff30fac', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('27143f7f-03e6-46f5-ba5e-864ca9fa3a79', 'd0027d2f-3296-48a6-83c8-9df553f733d1', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('271bfc65-a0fb-4cf9-b056-8aff52e32139', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('27692b50-d7bd-47ba-8ec1-42d96aa82410', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('27b4942e-bd70-4ef4-a600-b9c5e3a79eb2', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('27f43df9-ae98-47cd-a909-5e15cb6d722e', '64be2b18-d779-4782-b8ac-134e300c22c2', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('2809d76b-a34a-4289-ad22-dc91551e83d0', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('2894ff14-ddf6-43c0-a627-4283155998c2', '65756748-daf3-4f68-895e-cb21578d6e10', '1');
INSERT INTO `t_funcrole` VALUES ('28cd6942-8d98-4faa-a46d-0ba0b59539d1', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('2a63860f-b090-4173-b39f-5f875b06e963', '85007b42-5000-4f3c-ab06-6db70768d227', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('2a686485-c0e5-45c9-90ff-a9f3bbf3dedd', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('2a69a2c9-40c3-4b31-8981-f6b8952cd22d', '9c647130-f976-4b78-97a6-50ca5e90b229', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('2a6c5fb2-fc61-48a4-b099-3f379c7d085f', '3b663d34-8caf-4118-95ff-163142ead529', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('2a8946e6-f774-430d-9034-d95c4f27baf8', '546abd57-4fc9-4c72-a356-9c192680fe8d', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('2a9adcd8-485f-411c-b9eb-affffb54b1fb', '64be2b18-d779-4782-b8ac-134e300c22c2', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('2a9e591e-7c9e-4398-b52d-b1df8a1ef894', '877d84b4-4ba6-490d-bd3b-f758081d69fc', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('2b21dad8-01ec-4628-965e-3660f83dc6ce', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('2b77abe3-2fb4-424f-9ab4-6200155e6d21', 'f1101e76-ad00-46f0-806f-51679eea6f10', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('2b7c09cf-5f33-480d-b9cd-60e5b21df0d3', 'f4252b4e-ff8c-483c-8638-4c7afb20512a', '1');
INSERT INTO `t_funcrole` VALUES ('2bf582b0-a610-4e0e-970c-6def1d014229', 'ed582647-db0f-458d-9a8b-6bd0c7864828', '1');
INSERT INTO `t_funcrole` VALUES ('2cf8c852-3583-4071-b586-5a78f90036c0', '693a6579-685b-4ca8-b5b4-356d356d6b65', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('2d495240-820f-4961-8ca8-126518103be5', '877d84b4-4ba6-490d-bd3b-f758081d69fc', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('2dca347c-b192-4391-9117-9e2f17f4a6ed', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('2e149d15-b36f-48de-ad75-d04d3c101bca', 'f1101e76-ad00-46f0-806f-51679eea6f10', '1');
INSERT INTO `t_funcrole` VALUES ('2e52fd34-4022-405d-a2df-d34966105007', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('2e96c67d-1fd8-4796-aa41-28dc32d798f3', '65756748-daf3-4f68-895e-cb21578d6e10', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('2ef6c287-5b40-4aa3-aa7f-a1bf3abb91c6', '49ceb1c0-78cb-4137-8be8-023f91260f17', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('2f6beb70-8040-48ae-af93-c0a8e1f1ea31', '592163cc-6836-42d4-b41d-ca824aeef106', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('30982be6-6a0b-44a8-9dac-f04d88a78c01', '909b6004-1699-46b2-a30a-390c7545638e', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('310f3b80-6e7c-4ce1-8c4b-fb563090dedb', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('3143365d-4913-44c5-a63d-2db542fe2f69', '0d00808e-9d4d-4ebf-84de-0fc79897284a', '1');
INSERT INTO `t_funcrole` VALUES ('315a17a6-027c-45cb-976d-a5c1f79f0f65', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('32210900-37f7-4b07-9807-09e2bc29b1f5', 'ed582647-db0f-458d-9a8b-6bd0c7864828', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('329cdeaf-7129-4b0b-a78c-2fe41d7246e6', '9ef940de-e3e9-4213-8afd-073f94119e7a', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('32cafd5b-0799-45e1-85ce-f12248fc4455', '3b663d34-8caf-4118-95ff-163142ead529', '1');
INSERT INTO `t_funcrole` VALUES ('33561a64-d0e4-44a8-9ff6-7f762d9a1377', 'f934eef9-451e-40e3-8212-2924dd9257c9', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('337c0847-47a1-4037-9c82-f8340a55371f', 'b28fec3b-35c1-465c-8659-6b9d126adbea', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('3508382c-44a0-449d-b3f4-3229caa2284f', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('36249f9e-e8ae-4980-97ac-86c832db1f7d', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('3642754b-cee4-4bd8-9062-1c25b8a932f7', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('36dce8ba-d7d1-45ba-9949-3e6015627afa', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('37431ee8-40e9-403e-9e2e-7073e750d3a5', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('37741f2d-7251-4cab-ad60-65f89cc2fd37', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('377a2a5e-820a-407e-8d63-8c9336918fe0', '9d86c94c-79b6-4f59-8374-b651746139a2', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('37d2081a-2f65-4fca-af2c-67aa2ac31a0d', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('38b1c55e-4678-4b45-b31c-6cdeda6a3f21', '38403cb9-8fe2-4daa-8acc-2091f67a4794', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('39bfb702-aa81-4bd5-a7db-0635e5c0d567', 'f934eef9-451e-40e3-8212-2924dd9257c9', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('3b52bc02-e541-45e5-a2ae-58a9e89580dc', '955048f9-1d98-43d5-8c50-28a825d6f079', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('3ba5cf5a-5928-4f49-8b7d-42344c638493', '49ceb1c0-78cb-4137-8be8-023f91260f17', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('3c1ae574-633f-4cee-9621-f170da922c3b', '909b6004-1699-46b2-a30a-390c7545638e', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('3c481afe-c1a9-4169-ab95-81bef855696f', '46877307-f33c-4325-9e57-b0aacc4dac6c', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('3ceb08b6-9b0b-454d-a1ce-3bcb298b6b2a', '9f44891d-d217-42a4-9ef3-8c805da170fd', '1');
INSERT INTO `t_funcrole` VALUES ('3db40fdc-c2db-4fe3-91d0-2206a295a8d9', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('3e44e19a-e861-451f-ad31-f2ab03189e19', 'bce5be65-58c0-416e-b96a-c35de480a33b', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('3e63ca02-7ba6-42e9-8f4f-5589b249e90e', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('3f38b2eb-2df3-4f8c-b1c8-84089771df4e', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('3fe36910-c694-4d40-bc8d-e15fa42a44ec', '64be2b18-d779-4782-b8ac-134e300c22c2', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('400afe03-37f8-425b-99ea-e92195f3af9e', '9d86c94c-79b6-4f59-8374-b651746139a2', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('40285b07-b2c3-479b-8c67-92fb0b872fa7', '58a68c31-7894-4e43-b576-b839e3f7aaa3', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('40d651b9-5f72-40e2-ba9a-6b8dfafa4e47', 'bce5be65-58c0-416e-b96a-c35de480a33b', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('4121fe06-3bb2-4eb3-b6a1-685c59fc394a', '0d505c77-2348-4077-93c8-498585a1c1ac', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('419257f6-7d9e-4ce0-9ef6-d9513a353fee', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('41d6091d-083f-46a2-acc6-64ebd6a42f01', '433577db-e772-485c-87b8-db171533d8e5', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('425d3447-9e80-4779-a2ba-2a84858b3492', 'a7d02dcb-41d9-4ea4-b0dd-a6a306eef7ef', '1');
INSERT INTO `t_funcrole` VALUES ('427efcf5-8516-4c59-93ec-cdb3bcb328d0', '016967b6-b16c-49c5-9257-062e2fff7410', '1');
INSERT INTO `t_funcrole` VALUES ('4306cfc1-6354-4405-aa6e-8dd24c31b3e1', '58a68c31-7894-4e43-b576-b839e3f7aaa3', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('433fd493-74de-40be-8510-ace7887f0161', '955048f9-1d98-43d5-8c50-28a825d6f079', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('434ec9f0-c8c4-40f5-a09b-f81a90e92bf2', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('437a9dda-b1bb-48fa-a504-ded00e57a402', 'a150733c-685f-45ba-8bec-d619d6142474', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('43e45814-932f-46c5-8165-bd503cfdc36d', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('4409da0b-0d58-4a7a-b6b4-99b78456e227', '1a3800c0-b68b-4f73-869d-60b925b43bc8', '48990dc2-019b-4c8e-882f-b90a520c7ab9');
INSERT INTO `t_funcrole` VALUES ('443617cb-712a-4ce3-b7e2-3ddb470b856f', '0a690803-2b9f-4513-92b2-d7a30e2f0682', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('44a23a70-d1e5-41ee-9585-fecb7836bdb8', '9c647130-f976-4b78-97a6-50ca5e90b229', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('455c11cc-7f30-408c-a21a-a3bd4ead55cc', 'a150733c-685f-45ba-8bec-d619d6142474', '1');
INSERT INTO `t_funcrole` VALUES ('45842b2c-b9a7-4e7d-bd0d-14e740353225', '955048f9-1d98-43d5-8c50-28a825d6f079', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('4588dcb4-b13f-44e8-8115-0a2d15af4575', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('4619c722-bfc1-43f7-8db3-22849723707d', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('47934a35-4735-43a4-a74a-7b01427b9822', '795a36e1-cf19-4353-971b-570c77090a0f', '1');
INSERT INTO `t_funcrole` VALUES ('47a8d261-748d-4eee-aea1-e69356486303', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('47ad1c85-8d69-4553-8507-f0782844b2b4', '546abd57-4fc9-4c72-a356-9c192680fe8d', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('48724804-194b-4efa-a0d4-a1e1096435f6', 'bce5be65-58c0-416e-b96a-c35de480a33b', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('491747b8-906b-48ce-bbad-fe4972eb300b', '2fd7798c-31c7-4496-812d-f58c5ff30fac', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('492992d8-86d3-446a-86d9-966d582251a0', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('49b6502c-b213-464e-be97-02b86888ae8f', 'bce5be65-58c0-416e-b96a-c35de480a33b', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('49c3bed2-e9f7-49bf-a30d-d8723f5f7ae7', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('4a1bcad8-47b6-456d-bd9d-ee17af2f5ba8', 'b28fec3b-35c1-465c-8659-6b9d126adbea', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('4a7061a0-8171-4337-8425-89f824679532', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('4ae9cb43-7811-43c6-a287-bd8d4eba3d9c', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('4af10b98-91f4-4aa0-8bef-ae7299ed1806', '3ae5aa05-4298-4842-ac4f-3db6a4110213', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('4b5a58c6-38f8-4da0-b1bb-f174441e8ec3', 'd60d28e6-7c49-4041-a294-fab4bfe29942', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('4bd0c776-114e-4895-bf0f-f3d4c88f62ad', '64be2b18-d779-4782-b8ac-134e300c22c2', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('4bdc44c6-58ef-4b86-9b03-0f2f9f3babb7', '85c0a778-ed29-4bdc-abef-5c00773cdb34', '1');
INSERT INTO `t_funcrole` VALUES ('4cc746df-ddbd-4bf7-a0b2-20b268d1d051', 'd60d28e6-7c49-4041-a294-fab4bfe29942', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('4cd54cad-05f2-46a8-83a2-b22c2cf65159', 'f73fd1f9-244e-4257-8e65-f646747a76a6', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('4da33563-dc27-4580-b909-24412d18ae52', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('4eb36bba-36e4-43a3-ac15-131be573ea92', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('4ecfdfcf-bdc3-4bd3-bd49-bdd98d4d538c', '9c647130-f976-4b78-97a6-50ca5e90b229', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('4f0d0488-b79b-4545-baa5-03fcc71f51a0', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('50b24044-8fc0-4ba1-88ff-4bb798297856', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('50c187d7-f621-4289-a949-abf2938f9009', '64be2b18-d779-4782-b8ac-134e300c22c2', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('51836da0-2171-4edf-9590-93fca15c4006', '693a6579-685b-4ca8-b5b4-356d356d6b65', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('519931aa-cb8b-45f3-878a-1d3490ce8e80', '680de13d-409b-41a0-a29e-95291eac25dd', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('51b50935-a8ca-442e-abd7-fe11dd08c23e', 'b41ba9f4-d243-41c8-ba73-25dae583279e', '1');
INSERT INTO `t_funcrole` VALUES ('51e00bea-8867-4ddc-8634-3081da6a0876', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', '1');
INSERT INTO `t_funcrole` VALUES ('520e4e59-8dbb-40fa-b47a-556982eac4aa', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('52b2937b-b4d8-48aa-b486-e09c01257c8d', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('52d1eef1-d6e6-4096-af99-94432d768fb2', '877d84b4-4ba6-490d-bd3b-f758081d69fc', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('52d3c97a-a104-4965-b4a3-792b4921e3ba', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('52deca10-f9b8-46ff-9793-c816d508d37d', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('54a0f3d4-f6ff-40aa-a015-d3c4e871bb88', '991859cf-48c8-462d-8bc1-619413044e0c', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('54ba5f52-bf46-406d-b5c6-530240551f73', '991859cf-48c8-462d-8bc1-619413044e0c', '1');
INSERT INTO `t_funcrole` VALUES ('554f9ccf-cc39-41eb-aad2-902c5f0e490b', '909b6004-1699-46b2-a30a-390c7545638e', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('5580fe7d-025f-4885-b092-ed9e51426a2d', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('55c38484-1217-43ec-a48d-819a40ea73a8', 'f1101e76-ad00-46f0-806f-51679eea6f10', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('55fa28dc-693f-45a4-bc49-2559f614126c', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('560bb11d-85eb-4199-aef4-3cfef9d5f08e', '680de13d-409b-41a0-a29e-95291eac25dd', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('561e2af4-3bc5-4c19-ac6d-8db3937e6127', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('5653acba-6db8-4a3a-b511-59d40281037c', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('572e4a38-8252-4f24-9913-840c4e4fa3bf', '38403cb9-8fe2-4daa-8acc-2091f67a4794', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('5732018f-847d-4d9f-9460-cc6070081b16', 'b28fec3b-35c1-465c-8659-6b9d126adbea', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('57667e3c-23ac-4fdc-b292-83c7e0c694f9', '680de13d-409b-41a0-a29e-95291eac25dd', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('593e148c-c5eb-4e1d-a43f-9cda4a746a03', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('5970a757-7a8d-49de-b0f1-35a48d0c5010', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('598afa93-9fc0-4274-86d8-75650493b0de', '8532a6bc-739e-417c-8525-234317b16654', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('5a099c22-f04a-4667-9ee7-7799c0131cdc', '9ef940de-e3e9-4213-8afd-073f94119e7a', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('5a393a4b-6585-4d6a-b52b-634688704aa3', '2fd7798c-31c7-4496-812d-f58c5ff30fac', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('5a6527b1-d3c0-4a56-85fe-8a99d46be87e', '1', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('5ab83d64-af7b-4c63-a75f-cd922770a00a', '46877307-f33c-4325-9e57-b0aacc4dac6c', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('5b3257d5-062d-46d4-ac39-0da67dbd51c8', '58a68c31-7894-4e43-b576-b839e3f7aaa3', '1');
INSERT INTO `t_funcrole` VALUES ('5b627d99-470a-4a54-a965-6723b20b4e8d', '877d84b4-4ba6-490d-bd3b-f758081d69fc', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('5b7f9659-435b-491a-9854-c8a84b42965b', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', '1');
INSERT INTO `t_funcrole` VALUES ('5bcbec53-4d7c-4a11-9374-f3efb22e7733', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('5c2a6a89-20c1-46d9-afe0-16e4717e5b02', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('5c88d547-9f3f-4c23-8f7d-be3dde58c61d', '9ef940de-e3e9-4213-8afd-073f94119e7a', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('5cb47199-0470-41a7-8365-8ee3c0796deb', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('5d229bef-5069-458d-a9f1-1bafb164515a', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('5d5e3c1d-982e-4d51-8e44-1e2527d2749a', 'b28fec3b-35c1-465c-8659-6b9d126adbea', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('5e247ec5-e80e-4128-940f-003704e6050a', '1cc9445c-b5a2-4cfe-b76c-552781506a89', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('5e2b8e9f-dadd-459f-848c-834fb901fe3c', '65756748-daf3-4f68-895e-cb21578d6e10', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('5ea3ac14-dae8-42be-81d5-40ba21270114', '64be2b18-d779-4782-b8ac-134e300c22c2', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('5f02a5d3-d8a4-4439-9bd8-9c0f1af52677', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('601010aa-dd85-45c2-bedd-2bf9ffb15eb0', 'd60d28e6-7c49-4041-a294-fab4bfe29942', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('60488bd5-c1f4-4067-b063-5a4b89630e4a', 'a019364a-3968-40f3-ae50-b633f7a52e43', '1');
INSERT INTO `t_funcrole` VALUES ('60f838db-bfc5-4d3e-a66d-32eed14d6c39', 'b28fec3b-35c1-465c-8659-6b9d126adbea', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('60f88e34-6bfc-44fe-8d9f-e8f638d583fb', '617bd5d5-ca94-4d94-8a93-7b453d613d86', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('613bfe0b-9499-4f59-b561-81eaca585d7b', '252087d9-c101-44dc-9943-5a275e646bdd', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('61a7e56f-52d5-4638-a719-2bacaa5fdb48', 'd60d28e6-7c49-4041-a294-fab4bfe29942', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('61b40315-742a-4285-a5e2-2a439461be72', 'f73fd1f9-244e-4257-8e65-f646747a76a6', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('61dd0d2c-c382-463b-ae8c-a06fb83bc86d', 'bce5be65-58c0-416e-b96a-c35de480a33b', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('620bc7ef-4888-4f26-9624-4576a90b1bb1', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('636ff820-edcb-4599-90e6-3cc9c835aaed', '46877307-f33c-4325-9e57-b0aacc4dac6c', 'c685f13f-ece2-493a-b06e-87744050b91f');
INSERT INTO `t_funcrole` VALUES ('63d70969-8073-4558-91c1-dc2753f8f6ce', '252087d9-c101-44dc-9943-5a275e646bdd', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('645656a7-cf02-4ecf-b2fb-1477988f2ae9', 'ed582647-db0f-458d-9a8b-6bd0c7864828', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('6466dd17-780e-477e-b80b-02cd1de5e376', '617bd5d5-ca94-4d94-8a93-7b453d613d86', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('64826a71-aceb-403d-88d8-909e1b3fc2cd', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('6515f1ca-fd7b-4627-81df-1979f2d22a71', '49ceb1c0-78cb-4137-8be8-023f91260f17', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('65164899-d57d-4a00-9657-7b3adf7e634d', '991859cf-48c8-462d-8bc1-619413044e0c', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('65a1a6f5-e437-4989-bf9e-07ab80871836', 'a150733c-685f-45ba-8bec-d619d6142474', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('6796d42b-62d0-422a-89b6-912b307913cb', '58a68c31-7894-4e43-b576-b839e3f7aaa3', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('690fb882-b25c-408b-b02a-9c2e19e52f5a', '909b6004-1699-46b2-a30a-390c7545638e', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('69aeed73-e908-4346-a7f6-25a08b877712', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('6a660cf1-613e-47e0-bd7c-e437c94c81b5', 'b28fec3b-35c1-465c-8659-6b9d126adbea', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('6afffbad-4542-4280-bf15-04ef0779dc12', '955048f9-1d98-43d5-8c50-28a825d6f079', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('6b135253-1c88-4094-be0d-62e1e59326e8', 'a150733c-685f-45ba-8bec-d619d6142474', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('6bed98ff-99d5-42da-9a52-cb03ae7095b9', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('6c3c92e8-337b-4861-9a54-e5d30901c04d', '617bd5d5-ca94-4d94-8a93-7b453d613d86', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('6c700ce0-d42f-4eae-ba61-0bc5d389328e', '8532a6bc-739e-417c-8525-234317b16654', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('6c81c87e-eef5-4b27-bf81-893f5477f9b4', '3b663d34-8caf-4118-95ff-163142ead529', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('6c8a3d56-0784-49ac-84cf-a1f463b27323', '8532a6bc-739e-417c-8525-234317b16654', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('6ce33fed-2862-48e9-afe9-f73acb3162d1', '49ceb1c0-78cb-4137-8be8-023f91260f17', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('6d5f15dc-eccf-4ac6-8cab-38f5d35ea34c', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('6da38a8d-6306-4e53-9488-55c92359317f', '693a6579-685b-4ca8-b5b4-356d356d6b65', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('6e046338-fbe9-4612-bc17-a587614efb9d', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('6e746e6e-5d12-4882-ad45-4291975b8c72', '2fd7798c-31c7-4496-812d-f58c5ff30fac', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('6e8f4ac2-d169-4a96-b67e-17ef608f2ead', '3ae5aa05-4298-4842-ac4f-3db6a4110213', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('6fae7681-bd3c-4c14-905a-075e9050a0ac', '1cc9445c-b5a2-4cfe-b76c-552781506a89', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('7084cad5-7e61-4aaa-8e72-59c2afbd3a83', '1', 'c685f13f-ece2-493a-b06e-87744050b91f');
INSERT INTO `t_funcrole` VALUES ('709fcf49-6982-44dd-b651-a6c25b687748', '8532a6bc-739e-417c-8525-234317b16654', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('70aa630d-e007-4fc2-b1c4-31f5a05fd9b3', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('719be183-ba33-4dbd-bbb1-9209a335533a', '909b6004-1699-46b2-a30a-390c7545638e', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('71cfb4a4-1258-44f6-9aa3-bf8d0cdae509', '0d505c77-2348-4077-93c8-498585a1c1ac', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('7255b86b-f738-4142-993a-8822c9dbe16c', '9ef940de-e3e9-4213-8afd-073f94119e7a', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('726109bf-ef71-4c20-8ce6-cc9d1015449b', '909b6004-1699-46b2-a30a-390c7545638e', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('733b0d19-4ca5-4661-ae8f-b621b3385e60', '680de13d-409b-41a0-a29e-95291eac25dd', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('73c4c26f-9f63-4100-956e-ed0bbb591028', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('7481727a-8072-471c-bb52-979d5a93a91b', 'c0eb9c16-deff-4be3-a63c-95225e15b7d1', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('74afc2bf-a1c9-4af1-96fe-ca16bebaf9b7', '546abd57-4fc9-4c72-a356-9c192680fe8d', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('767fbbea-77fa-427a-996b-ba2baaf50a04', '1', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('76a74a15-bbdd-48bd-b9d1-42945b8c13a0', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('77511a7f-5a0f-4ede-a5d2-3ba6fae298a5', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('77623d4e-ec50-40bc-ac2d-67547c30e82f', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('7769d21b-a7c4-4224-b389-9bc687eac799', 'f1101e76-ad00-46f0-806f-51679eea6f10', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('7823525f-1af9-49bd-93eb-484e48c93ce3', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('785aa941-a18e-4dea-8e47-ec8e066deebe', 'd60d28e6-7c49-4041-a294-fab4bfe29942', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('7885d399-b291-4bfc-abe3-177b82249b3d', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('7930a255-f702-4c26-84e0-4fb1d30b8768', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('79403735-5c22-4b53-855f-12966e4e8515', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('79d49f28-9f7c-422b-a7f7-19e34eb4d793', 'f1101e76-ad00-46f0-806f-51679eea6f10', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('79fe4ad6-4a86-4f9e-a5a9-bfc48f17cd57', 'ed582647-db0f-458d-9a8b-6bd0c7864828', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('7a424944-369b-4822-b386-e71c0b40c78a', '3ae5aa05-4298-4842-ac4f-3db6a4110213', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('7a61dbb9-5c88-4f57-b40f-a27d35f2bb70', '65756748-daf3-4f68-895e-cb21578d6e10', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('7aee92b6-e431-45c2-ae63-42aa8e1e5ff8', '693a6579-685b-4ca8-b5b4-356d356d6b65', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('7b3b6eb4-3ac1-419d-bb67-82d3db40f67e', '680de13d-409b-41a0-a29e-95291eac25dd', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('7b4decf9-8b46-4e79-a677-dbed5fa91674', '1cc9445c-b5a2-4cfe-b76c-552781506a89', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('7c0ce292-b3ce-4936-86e3-707249b512b0', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('7cb7502e-3e11-4dcb-8967-fb22c2a4ac33', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', '1');
INSERT INTO `t_funcrole` VALUES ('7d27e4d4-6bdd-4d7a-94e9-6a1e6388bea4', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('7df633d9-568c-4e66-a315-5727339ee92d', '877d84b4-4ba6-490d-bd3b-f758081d69fc', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('7ed7195f-a38f-42db-90dc-a2d6f32ee198', 'f1101e76-ad00-46f0-806f-51679eea6f10', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('7f334773-d452-4c2c-8b46-3035885fc19f', '64be2b18-d779-4782-b8ac-134e300c22c2', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('7f7e709f-abe3-42aa-af9f-f0f5c7eb4dbc', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('80393d65-b9d8-4ff5-a1a2-d91a87d19bed', '64be2b18-d779-4782-b8ac-134e300c22c2', '1');
INSERT INTO `t_funcrole` VALUES ('8176ca74-cd78-4cbb-b2c1-bf4d40adafaf', 'f73fd1f9-244e-4257-8e65-f646747a76a6', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('81d7ec0e-0e18-4e67-a818-5ef45f496ff4', '433577db-e772-485c-87b8-db171533d8e5', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('822a7b95-1144-4131-9761-c2b26a38aa9a', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('8259e574-5fc7-46ca-84ce-c21fa4aec5ca', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('82bb7fb6-eb75-4fd5-b3c0-66d5bf615991', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('83237413-d155-4768-9e73-78fe8a9c5d46', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('83b70f5a-25ba-4189-97dc-5814c28ec2e0', '58a68c31-7894-4e43-b576-b839e3f7aaa3', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('83e72337-5170-4dae-8282-3ac95ce63a1e', '433577db-e772-485c-87b8-db171533d8e5', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('8403d8f9-73dc-4f9e-8ba1-ed7c5fc80840', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('84089079-9322-4c7f-8caf-015a5a53499c', '8532a6bc-739e-417c-8525-234317b16654', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('84132498-de04-491d-99fb-e0b132c9d375', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', '1');
INSERT INTO `t_funcrole` VALUES ('8458fa95-fbc4-4e12-8dd2-b3540187f0b8', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('84ce4ed6-9b14-4d51-850c-4afcb7b6d6cd', '9131b350-0258-45e6-a54e-6cc1a4ebe310', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('851c1603-a0d2-4e99-8d8e-5319bb528f91', '252087d9-c101-44dc-9943-5a275e646bdd', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('856cd192-13d1-4e4e-837a-f35a73aabf92', '9d86c94c-79b6-4f59-8374-b651746139a2', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('860d10b5-e6eb-47cf-afa5-974db7397e27', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('86ac5176-f4c4-4522-bc03-2ef531e7a1b4', '9131b350-0258-45e6-a54e-6cc1a4ebe310', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('86b6f7c8-e00b-4e12-83ce-7e9a33f90a8d', '0d505c77-2348-4077-93c8-498585a1c1ac', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('86be4d54-e8ec-46d8-83d3-d5ed487d0873', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('8736253d-f9be-49da-ade2-7b6fc69b1770', '0b42184c-bddf-45e1-a9b5-73e435f834ac', '74fa104e-3f8e-44e3-bb0e-a2c908c0cb6e');
INSERT INTO `t_funcrole` VALUES ('87a32545-7183-42a5-bc86-8792eb64ce63', '9ef940de-e3e9-4213-8afd-073f94119e7a', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('88026b55-5b4e-4a50-a2cb-d6554a7d0481', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('881319f5-3bea-4e50-8358-c8f3a0e91096', '991859cf-48c8-462d-8bc1-619413044e0c', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('88bffcbb-31d9-46ef-b65f-a964759ca440', 'f934eef9-451e-40e3-8212-2924dd9257c9', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('88c18cb1-da45-4a11-bc6f-98b34cddc5c4', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('8912fc1f-fbaf-4886-8e98-139547e624ed', '433577db-e772-485c-87b8-db171533d8e5', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('899fed3c-1394-4294-9819-b7c5ca6ed4bd', '617bd5d5-ca94-4d94-8a93-7b453d613d86', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('89b85752-2ba7-4801-a2a0-742f2acc8eca', '34e02b8e-2206-491a-818d-46cbaed13d84', '48990dc2-019b-4c8e-882f-b90a520c7ab9');
INSERT INTO `t_funcrole` VALUES ('8a773a83-0564-4c99-a5f6-773959bd42cd', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('8aa197fd-43b9-4244-a347-f3f1b831c92f', '2fd7798c-31c7-4496-812d-f58c5ff30fac', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('8ac4734e-e1cf-477e-8233-8d8c6422e87a', 'ed582647-db0f-458d-9a8b-6bd0c7864828', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('8be3dfa3-b22f-4313-a7e1-f13d6ca09315', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('8c653410-4746-45d4-a069-804c79f9ab7b', '877d84b4-4ba6-490d-bd3b-f758081d69fc', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('8c71f977-64b1-4dca-a184-89636fca926d', '46877307-f33c-4325-9e57-b0aacc4dac6c', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('8ca68c2c-37f1-4edb-b8e5-35b8e2f71250', 'ed582647-db0f-458d-9a8b-6bd0c7864828', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('8cd57504-e7eb-40f9-8511-a99fb3f2e075', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', '1');
INSERT INTO `t_funcrole` VALUES ('8dcb81c4-2150-4230-9211-5685163eb62b', '3ae5aa05-4298-4842-ac4f-3db6a4110213', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('8ddade9e-9287-4a34-9fa9-deb966e66479', '8532a6bc-739e-417c-8525-234317b16654', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('8fefd168-b12b-4561-89da-d67a019c3a12', '433577db-e772-485c-87b8-db171533d8e5', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('902abf54-a5f4-4f48-b200-174cdc114c50', '65756748-daf3-4f68-895e-cb21578d6e10', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('905b61bd-1b5f-4a7c-a51d-494a56a5164f', '2fd7798c-31c7-4496-812d-f58c5ff30fac', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('907efada-94bf-4ba3-85cb-c28283e7ae8d', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('908ed7c2-f417-41b4-923e-c966471e4e2c', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('916d85df-fe48-4dcd-9433-6f131d155092', '65756748-daf3-4f68-895e-cb21578d6e10', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('92182def-5605-4d5f-97ba-15f27b289fa2', 'a150733c-685f-45ba-8bec-d619d6142474', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('92703cf2-104d-419d-b2e1-6739ac54c86f', '592163cc-6836-42d4-b41d-ca824aeef106', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('9283eccc-cfa9-47f4-b2d8-58a251233a7d', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('930272dd-6812-4d0a-94fd-a1f1aff513e9', '877d84b4-4ba6-490d-bd3b-f758081d69fc', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('932ae915-e4e2-4950-a43f-f8d7c3154a88', '3b663d34-8caf-4118-95ff-163142ead529', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('933d1517-dd92-4245-85a3-0f166eea9091', '693a6579-685b-4ca8-b5b4-356d356d6b65', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('93a2997d-cd6f-4307-a99b-158acdb025a3', '46877307-f33c-4325-9e57-b0aacc4dac6c', '74fa104e-3f8e-44e3-bb0e-a2c908c0cb6e');
INSERT INTO `t_funcrole` VALUES ('93dc1e83-46b8-48bf-ae47-3a5c5ce2f58e', '955048f9-1d98-43d5-8c50-28a825d6f079', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('93f494ef-6912-4005-858d-f33deb172fac', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('944c0597-7fb4-49a0-91ca-bd5c360eb350', '0a690803-2b9f-4513-92b2-d7a30e2f0682', '238d2ef4-4a00-4851-b719-fcf22968fa51');
INSERT INTO `t_funcrole` VALUES ('94d09071-0c26-4dc1-b2dd-ab270f5c2401', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('94e24dd9-16d2-465f-ab28-45db37342b5b', '8532a6bc-739e-417c-8525-234317b16654', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('94e36dc6-81ab-4723-ba64-705f15ec2cc0', '252087d9-c101-44dc-9943-5a275e646bdd', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('94f92ea7-ac20-4adf-810d-44597c3bb59a', '693a6579-685b-4ca8-b5b4-356d356d6b65', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('95f4d7ea-f274-4bec-8ed4-56febfd785ce', '909b6004-1699-46b2-a30a-390c7545638e', '238d2ef4-4a00-4851-b719-fcf22968fa51');
INSERT INTO `t_funcrole` VALUES ('96d46000-267c-4304-bb66-64621dd38c0b', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('9715fcdc-f4d1-4d5e-a0fb-6ffe5d9aa68a', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('971dfc27-66ec-4c5a-a483-e65aed045b9e', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('97a93fb4-2a63-4124-a70f-4c06004eb3ac', 'cd4f522c-7c40-44a0-ae70-f054f8ff57a6', '1');
INSERT INTO `t_funcrole` VALUES ('98040fdd-ea8c-48f6-a9c8-7ec9f35115ba', '0d505c77-2348-4077-93c8-498585a1c1ac', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('987534ad-b874-409b-8c08-221c6db95b23', '617bd5d5-ca94-4d94-8a93-7b453d613d86', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('987c228b-9fa0-43c9-a854-1ad69dfe2456', '38403cb9-8fe2-4daa-8acc-2091f67a4794', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('98946e30-d9ab-4b0b-bd46-779839064c0f', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', '1');
INSERT INTO `t_funcrole` VALUES ('989e56dc-b335-487e-9290-ef8fd01a12f1', 'b28fec3b-35c1-465c-8659-6b9d126adbea', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('98accce7-75a5-40ac-b19f-ade888b31aee', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('99938642-0cd4-4a8d-b9da-3748e9fff2ea', '9131b350-0258-45e6-a54e-6cc1a4ebe310', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('9a0e82c3-ecc4-4b91-a4d3-f202d38b4ea7', '0d505c77-2348-4077-93c8-498585a1c1ac', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('9a338d90-c25b-438f-8fe6-25920c47291c', '65756748-daf3-4f68-895e-cb21578d6e10', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('9b6f4d34-c7bb-427f-8dcd-b59fb898a07f', 'f934eef9-451e-40e3-8212-2924dd9257c9', '1');
INSERT INTO `t_funcrole` VALUES ('9c05f85d-4edc-45cd-a82d-62927064da10', '38403cb9-8fe2-4daa-8acc-2091f67a4794', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('9c4ca987-1c15-4cfd-8f09-b8730c10e5f8', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('9ceea6b1-c567-4ed9-806b-02c9c0d1f1e0', '1', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('9e46fca6-b19b-4a32-a967-6064614e1e6a', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('9e561958-d937-4713-b5a6-27ba923d2393', '680de13d-409b-41a0-a29e-95291eac25dd', '1');
INSERT INTO `t_funcrole` VALUES ('9e9a63ac-3a4d-4eb4-aa78-ada85d30991a', '9131b350-0258-45e6-a54e-6cc1a4ebe310', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('9f76b661-40a9-47f5-9f61-5c0cfe232c3f', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', '1');
INSERT INTO `t_funcrole` VALUES ('a03fbc14-2958-4b74-a5c3-996d1b2644f9', '9131b350-0258-45e6-a54e-6cc1a4ebe310', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('a08d75da-7701-4532-8121-48176c3bd0e8', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('a0ba195b-057b-479c-b231-15ca0bf5b329', '3b663d34-8caf-4118-95ff-163142ead529', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('a0cabdfb-3c6d-4a96-9788-97ab6f7fcac9', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('a0fbb4a2-04c2-4aad-ac16-d984a8bfa932', '0b42184c-bddf-45e1-a9b5-73e435f834ac', '1');
INSERT INTO `t_funcrole` VALUES ('a1693389-b52f-49e6-bbb8-51f8b47c3d7d', '36c63743-b977-4215-a836-b56975acbec1', '1');
INSERT INTO `t_funcrole` VALUES ('a20d8491-c1e1-412a-a948-a7369c2aeb9f', '85007b42-5000-4f3c-ab06-6db70768d227', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('a25c5c46-cfa1-4166-816f-777bfc82552e', '8532a6bc-739e-417c-8525-234317b16654', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('a2a130ef-e9d8-4dc9-a0d6-aa5e8649a2f8', '3b663d34-8caf-4118-95ff-163142ead529', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('a2b7c9e3-6b45-4b5d-84cf-14e9b776729c', '252087d9-c101-44dc-9943-5a275e646bdd', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('a2e98e67-9857-43cf-9453-7cfdfaf59080', '9c647130-f976-4b78-97a6-50ca5e90b229', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('a2f52ad3-ce35-40a8-ab24-a78ba19e2d1c', '9ef940de-e3e9-4213-8afd-073f94119e7a', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('a49d96e7-4b6f-40b8-882e-2a5cef9d68fd', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('a4b29145-44be-4155-b7e6-5a749c15b332', '909b6004-1699-46b2-a30a-390c7545638e', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('a5edabcd-9c19-46f0-9d2b-7588d3e392a7', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('a665b5df-04bd-4c47-8769-2380ebf8516e', '49ceb1c0-78cb-4137-8be8-023f91260f17', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('a671079e-4562-4ad5-8a1e-6e9fc55be4ca', '9ef940de-e3e9-4213-8afd-073f94119e7a', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('a6a31fe2-9e25-49eb-83ca-a62d12358eef', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('a750a49f-685b-4c1e-b2d3-567e7a1c4023', '85007b42-5000-4f3c-ab06-6db70768d227', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('a75f5e13-91d4-4d6f-b48a-f8fb4e0013b1', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('a77cf0dc-3774-4f91-aadf-a7358607eb5c', '909b6004-1699-46b2-a30a-390c7545638e', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('a81f5b45-6ef4-42a5-979a-247eb7de1320', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('a847c7a7-d00a-4cdc-877f-2d6fcc0a2924', '38403cb9-8fe2-4daa-8acc-2091f67a4794', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('a8983f06-7379-4455-ad2f-36ec9539cd2e', '955048f9-1d98-43d5-8c50-28a825d6f079', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('a8b1bb94-61d2-477a-a928-51680182f6b6', '9c647130-f976-4b78-97a6-50ca5e90b229', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('a8bf260d-581c-40a6-a736-1d24887069f8', '433577db-e772-485c-87b8-db171533d8e5', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('a92316aa-f128-4878-ac93-8b37044ea1d4', 'bce5be65-58c0-416e-b96a-c35de480a33b', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('a97238f0-7d9d-4a41-ba49-f181bd2db0b3', '909b6004-1699-46b2-a30a-390c7545638e', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('a98f13f2-4fa4-494b-a68f-338ae0bd3dd6', '592163cc-6836-42d4-b41d-ca824aeef106', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('aa5a00b3-1ee0-4dfd-abec-cc9bdefce857', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('aa6ac230-f946-48ac-b4c2-b254ccd52554', '991859cf-48c8-462d-8bc1-619413044e0c', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('aa85380e-13a0-4a9d-80c6-87ae2ea3c75c', '3b663d34-8caf-4118-95ff-163142ead529', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('acabf0cf-986e-4ed2-9d39-7508931ccc24', '0d505c77-2348-4077-93c8-498585a1c1ac', '1');
INSERT INTO `t_funcrole` VALUES ('accdbcca-99f5-4257-8437-df9cf57858ec', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('ad6ed7d7-0599-41a1-bc12-51879f5db0b5', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('ad763e06-41b1-4346-b713-229f17a0f6dd', '3ae5aa05-4298-4842-ac4f-3db6a4110213', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('ad8b3593-07ce-4b26-98f6-c3bc323c3df9', '680de13d-409b-41a0-a29e-95291eac25dd', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('ada25f86-5952-4968-aa4e-1550e71be5ca', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('ae219e2b-4560-4d03-9cf5-4e3e4db66615', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('ae8629c9-ebff-4952-9223-c334f9c05c39', '1cc9445c-b5a2-4cfe-b76c-552781506a89', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('aeb39d94-feb6-4bd4-978a-d021cfd1974b', '2e0cb290-0fd8-4c1b-a4a7-74eea1fab7d4', '1');
INSERT INTO `t_funcrole` VALUES ('aed04697-94f3-4bde-8abe-c6d0461be95f', '991859cf-48c8-462d-8bc1-619413044e0c', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('aef04f30-3c5c-418a-9248-4a45d6e71807', 'f73fd1f9-244e-4257-8e65-f646747a76a6', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('afd304c2-95b9-4156-99c9-8c87e84df85d', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('b0257d08-cc12-431b-bfd6-13c4a4adad54', '617bd5d5-ca94-4d94-8a93-7b453d613d86', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('b029bace-8c3b-44fb-9c71-271aff26e515', '85007b42-5000-4f3c-ab06-6db70768d227', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('b02f290a-1eca-4a2f-a41d-4f777356471d', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('b039028a-745a-45e6-bb0d-aa216756b8af', 'd60d28e6-7c49-4041-a294-fab4bfe29942', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('b127c952-bf08-4e91-9fcc-acdf119e7c2f', '680de13d-409b-41a0-a29e-95291eac25dd', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('b1489f99-c097-40b5-ab7f-fe15a9128c91', '46877307-f33c-4325-9e57-b0aacc4dac6c', '1');
INSERT INTO `t_funcrole` VALUES ('b18c4d66-7c4e-4993-a656-49af0276dda4', '9131b350-0258-45e6-a54e-6cc1a4ebe310', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('b19dfe0d-d823-4f73-a9e4-7e9a6ce60af7', '991859cf-48c8-462d-8bc1-619413044e0c', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('b2bdf4a1-c1de-4b18-a17f-5e2552868340', 'e7dc4c58-8d04-4de6-97fa-6655706aaad6', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('b2f98c28-dff2-4533-ab65-702cc48d5f2d', '909b6004-1699-46b2-a30a-390c7545638e', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('b3157ef2-15b5-4008-b068-cecc81a34d08', '9131b350-0258-45e6-a54e-6cc1a4ebe310', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('b42949ad-55ec-4deb-9d0b-a6a210f24c88', '3b663d34-8caf-4118-95ff-163142ead529', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('b4d193f5-0c9b-4981-bc32-471ca7fe4dd5', '58a68c31-7894-4e43-b576-b839e3f7aaa3', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('b4f176a1-97fe-4b56-89c0-dae5946c5c71', '36c63743-b977-4215-a836-b56975acbec1', '48990dc2-019b-4c8e-882f-b90a520c7ab9');
INSERT INTO `t_funcrole` VALUES ('b5564077-b6be-417d-91ac-e194f583fdf1', '0d505c77-2348-4077-93c8-498585a1c1ac', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('b58cfe0c-ded8-4c5f-a7de-6d542eee7443', '3b663d34-8caf-4118-95ff-163142ead529', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('b5b55745-b8d9-4437-abbe-5247b4a6e84f', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('b61d8c1a-b108-4e47-9030-333802c4ddbd', '3ae5aa05-4298-4842-ac4f-3db6a4110213', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('b6729f82-24fe-4368-8871-425bc70316cb', '546abd57-4fc9-4c72-a356-9c192680fe8d', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('b68b58af-edf5-45d7-8f62-7415668b4f52', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('b89476e3-6076-4392-ad83-e3e96b8f0418', '433577db-e772-485c-87b8-db171533d8e5', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('b951d879-7b03-450e-8218-cb7ec492fb2e', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('ba33fb42-a557-4594-b004-946dea77b0d5', '3b663d34-8caf-4118-95ff-163142ead529', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('ba591196-c2e0-480b-9cae-957fcb3266d7', '3ae5aa05-4298-4842-ac4f-3db6a4110213', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('bb769fcd-8b0e-41a6-bb52-efcbc8f07219', 'a150733c-685f-45ba-8bec-d619d6142474', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('bc25a3c7-1e78-498d-98c9-c8ae05717d92', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('bc5ab3db-73aa-4911-b554-24166d2fc655', 'b28fec3b-35c1-465c-8659-6b9d126adbea', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('bc8a8975-2601-4210-bb83-f42b6cc6c520', 'c4cd7878-a890-44b0-96a3-fba609c8dd24', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('bc94b380-0ed9-429c-948e-332f802fdd0f', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('bcce14d7-3574-4f8f-b479-c2e7a69e5992', '877d84b4-4ba6-490d-bd3b-f758081d69fc', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('bdb1bead-0de0-47b3-a5b0-118c9487a0da', '0d505c77-2348-4077-93c8-498585a1c1ac', 'c685f13f-ece2-493a-b06e-87744050b91f');
INSERT INTO `t_funcrole` VALUES ('bdf75ab9-8384-479b-96fa-fad1eb0d1cf7', 'd60d28e6-7c49-4041-a294-fab4bfe29942', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('be61ca54-8f9c-4f8c-afff-659d62159c31', 'd0027d2f-3296-48a6-83c8-9df553f733d1', '238d2ef4-4a00-4851-b719-fcf22968fa51');
INSERT INTO `t_funcrole` VALUES ('bf60257c-24d6-4352-ba96-501db1263b54', '546abd57-4fc9-4c72-a356-9c192680fe8d', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('bfaa4e27-6a62-41f1-a27a-7ca6e9e7db7f', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('bfbbce1e-56a1-4dbe-95bd-f962e285b018', '9d86c94c-79b6-4f59-8374-b651746139a2', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('bffbf95e-249b-4f5e-acdd-92a25da33b70', 'bce5be65-58c0-416e-b96a-c35de480a33b', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('c0866511-00e5-4fac-9007-b1af0c072a9d', '46877307-f33c-4325-9e57-b0aacc4dac6c', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('c16ee8e9-2d27-4b46-b2c6-e9e49ae2dd9c', '617bd5d5-ca94-4d94-8a93-7b453d613d86', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('c19f2ae9-d193-4fa0-b6c7-cee675aa0c1b', '0c64ca15-0713-4a4e-98c2-e5303fc45c20', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('c236dd90-9220-48cb-a429-35e9e2e427ef', '0d505c77-2348-4077-93c8-498585a1c1ac', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('c2a4aa45-0600-4445-a95c-6f7f694e8a64', 'd60d28e6-7c49-4041-a294-fab4bfe29942', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('c2aeeae4-aaa6-49e6-a587-e09c0af6b709', '38403cb9-8fe2-4daa-8acc-2091f67a4794', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('c2cabf0b-1340-42b3-9752-73acb4bf6a5e', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('c3598be7-ab4c-4852-995b-7af9aafd7947', '1', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('c3c8eed8-5f68-4587-9861-b746983c4f06', 'f1101e76-ad00-46f0-806f-51679eea6f10', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('c4011b92-6929-4776-9fa2-eab3bcdd0850', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('c4bd52fb-e2a4-4bf5-b1f9-8af659e15917', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('c6c5dee9-4781-452f-b77a-506b0c1478f3', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('c6ff6896-9e20-4e03-8166-c92c084b2a33', '38403cb9-8fe2-4daa-8acc-2091f67a4794', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('c7530458-c532-49c1-b254-c8f5f5af84ab', '85007b42-5000-4f3c-ab06-6db70768d227', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('c83b2743-22ad-4f10-9dff-8f4ee477c678', 'f73fd1f9-244e-4257-8e65-f646747a76a6', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('c89c5127-1ece-48b8-b093-3414a9405c8a', '65756748-daf3-4f68-895e-cb21578d6e10', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('c8d5c955-df61-4e8d-8d79-f023e6b3c300', '3ae5aa05-4298-4842-ac4f-3db6a4110213', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('c9338f33-17cb-4934-8d12-14391bd18ca3', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('c9476042-44c5-41dd-8b4b-6575936b667b', '400e8a3b-733c-41ce-838f-416ba0876159', '1');
INSERT INTO `t_funcrole` VALUES ('cc4ebb52-c9ef-4635-ae9a-b965f281b4e7', '33a920c3-6926-4fe8-bd44-888ba419f667', '1');
INSERT INTO `t_funcrole` VALUES ('cc807bb9-65a4-4960-8a0d-68884e8bf099', '991859cf-48c8-462d-8bc1-619413044e0c', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('ccee896a-5f13-4b1c-8c11-a1232fe7b54f', '9c647130-f976-4b78-97a6-50ca5e90b229', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('cd3a0ff2-8ec5-48a3-8784-4244a3c67f29', '546abd57-4fc9-4c72-a356-9c192680fe8d', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('ce6d8b29-36d1-4b87-9075-212ecfc2de6f', '0d505c77-2348-4077-93c8-498585a1c1ac', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('ce869932-8426-4f5c-94b3-774652566e1f', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('ce9b4a57-478d-4c61-a3c7-b2ad4d6ebc75', '0d505c77-2348-4077-93c8-498585a1c1ac', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('cefcd915-bb6d-4132-9b70-77e413f05bd4', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('cf5de4a7-ae94-4ea4-bc32-0e897b0f33bb', '49ceb1c0-78cb-4137-8be8-023f91260f17', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('d02d7084-d16c-4e6e-9dcc-6fc54344f1b2', '546abd57-4fc9-4c72-a356-9c192680fe8d', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('d095b32d-a9e6-4841-a8b7-85e4689053cb', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('d1373720-4903-4891-bcc7-4ef7c54cf121', '2011db4e-5dbb-4f6a-9062-80a13bc8d906', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('d17baf37-16c6-49cc-a638-655d46b3d14f', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('d30c81ca-2be6-47f3-81ff-114ab13d24ba', '58a68c31-7894-4e43-b576-b839e3f7aaa3', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('d31a37b8-8f17-4efc-99cd-df08d512a2aa', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('d33ebcd8-aef5-42df-8741-6867a8abe294', '693a6579-685b-4ca8-b5b4-356d356d6b65', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('d34a5a89-d4b5-4237-aed5-d6c2dfbec4c2', 'ed582647-db0f-458d-9a8b-6bd0c7864828', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('d43660d2-07db-49d2-b983-2c38c582c9dd', '909b6004-1699-46b2-a30a-390c7545638e', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('d46a6363-90b8-48b8-baea-0ee86834d63f', 'f934eef9-451e-40e3-8212-2924dd9257c9', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('d46ccc04-c00b-4d8c-9e7c-c6150daea5db', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('d527ed85-7425-4181-8716-cd73cab207d3', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('d5ad240c-8f66-4295-a3df-e3c1dcb619c8', '85007b42-5000-4f3c-ab06-6db70768d227', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('d5dc1565-5911-4499-a2f0-4959683ed71e', '8532a6bc-739e-417c-8525-234317b16654', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('d5f372be-2bd0-4038-aa04-1d1640e3f67c', '693a6579-685b-4ca8-b5b4-356d356d6b65', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('d604a63f-bca4-4709-8d6d-f92baf9c00ae', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('d64d158f-a575-47a7-904b-5ba84e3324b6', '85007b42-5000-4f3c-ab06-6db70768d227', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('d6c95c5f-22ae-4e75-9aa0-88e92ad92f2e', 'a150733c-685f-45ba-8bec-d619d6142474', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('d725a55e-3a4d-431e-a351-9a370fa425e5', '909b6004-1699-46b2-a30a-390c7545638e', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('d72eb70a-ea33-4c42-abe0-ce3ae74d789b', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('d83307c3-5470-4c8a-b321-2960f250f5f5', '6c5c8641-0ee5-408e-b173-c5909b3a7c55', 'f44e3339-5b69-409f-9e4c-8456a77c6110');
INSERT INTO `t_funcrole` VALUES ('d8d11aa3-9872-400a-86f3-07f8cf268f49', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('d92dba6c-7fcf-4abd-98aa-bb08ce8f4dda', '1c1b0c17-af00-4f0f-9273-288e71c8214a', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('d95dcee2-0476-47f4-ad1e-cee99e71f02b', '8208d3e7-417d-413b-8548-c3d0e5c71cac', '1');
INSERT INTO `t_funcrole` VALUES ('d985fc80-f7b8-4ff8-8bb3-9ccafc45107b', '5c76fa75-67e0-42e1-b6fd-cc963c1b07ba', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('d9a166fd-5049-4002-aa27-abeec3499c51', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('da0a5ea7-a1a4-4b1b-8f33-95d339086663', 'b28fec3b-35c1-465c-8659-6b9d126adbea', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('db5d3c06-8a20-4d4d-a4f5-e97034536b2a', '9c647130-f976-4b78-97a6-50ca5e90b229', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('db7382be-e123-4867-926f-48984edfb35c', '1cc9445c-b5a2-4cfe-b76c-552781506a89', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('dcf3bbf6-6842-4ee1-92b1-e81deae7d13a', '9ef940de-e3e9-4213-8afd-073f94119e7a', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('dcfbecbf-cedf-43bb-b13f-96e7cb082055', '52c3bdac-6b80-412d-8e85-2af211cfbe9d', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('dd4bea79-3c81-491c-a6b7-13a33f2ac43d', '546abd57-4fc9-4c72-a356-9c192680fe8d', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('dd653eef-ce40-4cb2-aa4a-ee13ae1426ca', 'f934eef9-451e-40e3-8212-2924dd9257c9', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('de276351-3962-444d-bb8d-9ab521f284d2', '617bd5d5-ca94-4d94-8a93-7b453d613d86', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('de3021ae-0a58-4f2b-a8ea-fb3e980e77ad', '38403cb9-8fe2-4daa-8acc-2091f67a4794', '1');
INSERT INTO `t_funcrole` VALUES ('deb304b9-c17b-407c-90e7-d05c5dd9093a', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('dffbbd1a-ae7f-4eaa-b530-9ac06784464d', '5bc7ab96-db82-4b4f-b744-e963963b1a3c', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('e01cf459-d9f1-4ae7-aae4-b01a85154543', '877d84b4-4ba6-490d-bd3b-f758081d69fc', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('e03bfb1c-8700-43fc-8da6-f8a778f0519c', '370667f7-f8f2-4b85-8ef7-391dc6d5dc48', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('e0705ee7-9e36-4257-ab43-5b764e67fa6e', '49ceb1c0-78cb-4137-8be8-023f91260f17', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('e08a679d-9cd8-42e9-9184-5cff1011ef17', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('e0a44d22-91fb-4ee6-90d4-a635ab9c21b2', 'f1101e76-ad00-46f0-806f-51679eea6f10', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('e119d244-206e-4dcd-b744-30f9035f5d2e', 'b46b68ef-7f21-4b38-a16f-15e22d31e72f', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('e13a970c-c782-4d8f-8454-3e91fec22efa', 'ebd1852d-96dd-462f-b62f-a5b9a772c452', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('e1483893-cca9-4aed-aa83-51930f36e19a', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('e1580b22-05e3-471c-80c9-540f0d32da34', '9131b350-0258-45e6-a54e-6cc1a4ebe310', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('e16ffb7f-dae4-473a-b8e4-bb44018d033a', '955048f9-1d98-43d5-8c50-28a825d6f079', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('e1d362e5-ba8a-412c-85a6-c3b86fc82389', '8532a6bc-739e-417c-8525-234317b16654', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('e1d8348d-eda3-408d-9c3f-fe2cecfdc727', '433577db-e772-485c-87b8-db171533d8e5', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('e24f53ce-0b61-44f4-8078-e50a8181f8a7', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('e256ceb2-a452-485e-ab26-a7aa6a314f80', '46877307-f33c-4325-9e57-b0aacc4dac6c', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('e3477eab-0044-4b8e-a81c-664a341dc8f5', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('e3772423-bb34-4c99-a870-0243024030ec', 'f1101e76-ad00-46f0-806f-51679eea6f10', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('e3a0f5b7-a417-4d28-b4e2-126277bf9593', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('e3b6db29-363d-4ed9-9ffb-8e5f1e3866dd', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', '1');
INSERT INTO `t_funcrole` VALUES ('e3c1013a-e4e7-4727-8da5-8d41f8504e0c', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('e400c107-b760-4a73-80c0-aec20f360054', 'd50ff2e5-c2be-4540-ba09-3ab5827de560', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('e4089a85-66dc-4193-b5d2-0a9d2904f985', '252087d9-c101-44dc-9943-5a275e646bdd', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('e43887db-884b-427c-b41f-10a01ccd5898', 'dc5626ef-1442-4fb3-8717-85f2b028ab88', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('e4e497a4-784c-4766-9c79-43107c8475d9', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('e4e80ab4-ea99-4593-93b9-0ddedf46d935', '49ceb1c0-78cb-4137-8be8-023f91260f17', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('e4fbf724-ac46-47b0-a647-1e6fbd11f7b0', '955048f9-1d98-43d5-8c50-28a825d6f079', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('e5cb92ca-ba6d-4454-98f6-d0ecce59e07f', '0d505c77-2348-4077-93c8-498585a1c1ac', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('e5de6eb9-637b-4da7-bfdb-0d5c63e47cfd', '46877307-f33c-4325-9e57-b0aacc4dac6c', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('e6288214-fe35-4612-9ad6-7e0143a21ab3', '9d86c94c-79b6-4f59-8374-b651746139a2', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('e6889d16-5c0d-4c5e-816e-39db00ece7f4', 'f73fd1f9-244e-4257-8e65-f646747a76a6', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('e7c799b3-fd4e-4e5c-b410-41b8fe9ff798', '9ef940de-e3e9-4213-8afd-073f94119e7a', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('e8148eb7-67a6-40f9-96d5-7c6285f955fb', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('e94d23c9-c9c7-44bc-92f6-1501444858a8', '2011db4e-5dbb-4f6a-9062-80a13bc8d906', '1');
INSERT INTO `t_funcrole` VALUES ('ea45f18a-2dfe-496f-ba52-f0421ee5cfe2', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('eaf5e6d2-3bdf-48be-9dc3-559cfa17e199', '82820e9f-3a5e-4e78-8cb5-1c287f6d6244', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('eb6a9bef-4d8a-40ef-8019-7e482befddb0', '592163cc-6836-42d4-b41d-ca824aeef106', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('ec14e652-e9e4-4998-9b4a-88f30f5fa12a', '34e02b8e-2206-491a-818d-46cbaed13d84', '1');
INSERT INTO `t_funcrole` VALUES ('ecf4faf9-0214-4806-ab39-12eadea1b92b', '1cc9445c-b5a2-4cfe-b76c-552781506a89', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('edca3707-1699-4e8a-bd0f-a8ca87b8653c', '3ae5aa05-4298-4842-ac4f-3db6a4110213', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('ede2541f-b379-48df-9382-8690ef54218f', '49ceb1c0-78cb-4137-8be8-023f91260f17', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('edfaf0c7-3ba8-4c92-a35a-5eacb296d72b', 'f934eef9-451e-40e3-8212-2924dd9257c9', 'a6b6cf7d-c153-406e-b8d4-1ea5b8e29152');
INSERT INTO `t_funcrole` VALUES ('eea6d439-c053-4897-b377-6a73a81166e1', '546abd57-4fc9-4c72-a356-9c192680fe8d', '5c096d63-1b97-48db-bda9-c9de9680a760');
INSERT INTO `t_funcrole` VALUES ('eecdc793-e3b0-4856-9262-392518295faa', '5fa32f1b-116e-4e18-af01-cc494d52ae8b', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('eefec922-e57a-48e1-8c05-eb36549bf129', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', 'f632f431-9637-44c7-9105-c5824c086b18');
INSERT INTO `t_funcrole` VALUES ('ef0882cf-2f30-4a4f-b540-efa067923409', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', 'a567bc35-0f86-4eec-8311-a7103941afb4');
INSERT INTO `t_funcrole` VALUES ('efafa32d-9a91-4ffd-bb47-9520ef9b1b4b', '680de13d-409b-41a0-a29e-95291eac25dd', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('f00a16e2-06af-4f01-a5b6-3009722c2aa1', '433577db-e772-485c-87b8-db171533d8e5', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('f09cfa88-6435-44a8-bf2c-bd17aac56864', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('f0ad840e-c0f1-465e-8ffe-ad834cbfb463', '0dd1b5b9-3ae2-4dbe-998e-6bb1b2b0eeed', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('f0af87a8-6150-46cc-af6e-ff0f26220314', '84e04c4e-75be-4c3c-ba7f-6cafbc2dabcf', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('f10840db-9107-4f86-ab38-e2a05d2fdc81', 'f934eef9-451e-40e3-8212-2924dd9257c9', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('f1f8fea4-3389-44b6-a20c-d06a22d43127', 'ba09cfb1-0b89-4462-b874-b491ba944f0f', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('f366ee3d-c966-4f50-8fc3-cef2324c8899', '877d84b4-4ba6-490d-bd3b-f758081d69fc', '1');
INSERT INTO `t_funcrole` VALUES ('f37893dd-1eed-497d-baa1-99b1a43a16bb', 'bce5be65-58c0-416e-b96a-c35de480a33b', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('f37d84df-4277-4c93-a6d7-a0b2d986668a', '46877307-f33c-4325-9e57-b0aacc4dac6c', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1');
INSERT INTO `t_funcrole` VALUES ('f3d4ee98-3b3b-4986-8be8-154ad519cf4e', '693a6579-685b-4ca8-b5b4-356d356d6b65', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('f5033961-3f6b-4754-b7ea-7f9547383889', '9d86c94c-79b6-4f59-8374-b651746139a2', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('f62ac1a1-eb0d-4f60-94d4-34973feb5f17', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('f62b7591-8c3f-4ffa-a7b8-0405d4abebc8', '4c482d6c-1bc9-4a1e-a58a-c88095e58717', '9d6471b4-2f67-4a02-be9c-290eacb9617b');
INSERT INTO `t_funcrole` VALUES ('f694c22f-c499-443b-94ac-168b7099148c', '5c93b40f-dc40-43ea-b2bd-9de0ca72c04c', 'e42c07c4-0663-4092-a71b-200ae9314940');
INSERT INTO `t_funcrole` VALUES ('f769f9a4-e3c5-40a8-917a-60bbdea8dd29', '9c647130-f976-4b78-97a6-50ca5e90b229', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('f7a77b99-4c6f-40d9-96d7-df3a359b3253', '776184b9-bad2-4cc1-8f44-a20d3ce5c71f', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('f7b88aff-031b-48c5-a677-77f9eaa74bda', '9c647130-f976-4b78-97a6-50ca5e90b229', '948e95f9-cd96-4eda-9177-ad876ee833da');
INSERT INTO `t_funcrole` VALUES ('f8ffa1a4-379b-47a5-a626-b3d921fcd1e4', '0d00808e-9d4d-4ebf-84de-0fc79897284a', '48990dc2-019b-4c8e-882f-b90a520c7ab9');
INSERT INTO `t_funcrole` VALUES ('f940c8c2-bbda-4943-89ba-3aaa5307f00f', '592163cc-6836-42d4-b41d-ca824aeef106', '36767c3e-1d78-47f5-8eaa-ede0c885cd8d');
INSERT INTO `t_funcrole` VALUES ('fa33bffe-e45e-4026-b00e-97ec29b7a43d', 'f8e88aec-72f9-46ea-8a94-1567d76b3347', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('fa44c886-e13a-4b25-8840-f8ed652baba1', '65dbee7b-2c5a-46e3-82fc-7b93c9439871', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('fabd5abc-c6aa-41b3-aaf0-67eff5402ac0', '693a6579-685b-4ca8-b5b4-356d356d6b65', '58e0e949-5010-4929-8961-5945b5a35960');
INSERT INTO `t_funcrole` VALUES ('fb0f5167-9f8b-41ef-90bb-468ce98d6c5f', 'a150733c-685f-45ba-8bec-d619d6142474', 'e8e82a1c-37ce-4b0a-999f-34e9c1f4b31d');
INSERT INTO `t_funcrole` VALUES ('fbea34dd-30b4-43cd-8f5d-5728bed79314', '49ceb1c0-78cb-4137-8be8-023f91260f17', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('fe4be85e-e48f-4490-95e0-8562032b7251', 'c1ef194e-aebd-46dd-9fd7-3f37f99cf302', '8892fb89-b850-49da-91ea-c67304670015');
INSERT INTO `t_funcrole` VALUES ('fe9109ee-8ba5-43a0-b424-214c631c0740', '617bd5d5-ca94-4d94-8a93-7b453d613d86', '5c758bb3-87b2-4f5e-93b8-412e42288bff');
INSERT INTO `t_funcrole` VALUES ('febef8ab-65da-4c87-8010-23426eef73ae', '8532a6bc-739e-417c-8525-234317b16654', 'c685f13f-ece2-493a-b06e-87744050b91f');
INSERT INTO `t_funcrole` VALUES ('ffa72143-99e5-474c-8499-63bf6a6ee1a4', 'f934eef9-451e-40e3-8212-2924dd9257c9', 'ec103493-0ad5-4626-b455-65c7e62ab4a4');
INSERT INTO `t_funcrole` VALUES ('ffaff162-60d3-4eea-b24b-7446e9cc1a0d', '252087d9-c101-44dc-9943-5a275e646bdd', '5da91f55-b9fb-469d-a98d-bdeef17b813c');
INSERT INTO `t_funcrole` VALUES ('ffd332cc-01d8-4816-b091-b4fa6e7fad91', 'd2d87472-5193-4af1-b858-3dedab847587', '1');

-- ----------------------------
-- Table structure for `t_function`
-- ----------------------------
DROP TABLE IF EXISTS `t_function`;
CREATE TABLE `t_function` (
  `funcid` varchar(64) NOT NULL DEFAULT '',
  `funcname` varchar(255) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `parentid` varchar(64) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `func_order` int(5) DEFAULT NULL,
  PRIMARY KEY (`funcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_function
-- ----------------------------
INSERT INTO `t_function` VALUES ('0a690803-2b9f-4513-92b2-d7a30e2f0682', '质量统计', null, '909b6004-1699-46b2-a30a-390c7545638e', 'result\\testResult.jsp', null);
INSERT INTO `t_function` VALUES ('0d505c77-2348-4077-93c8-498585a1c1ac', '用户管理', null, '46877307-f33c-4325-9e57-b0aacc4dac6c', 'user/userlist.do', null);
INSERT INTO `t_function` VALUES ('1', '菜单管理', null, '46877307-f33c-4325-9e57-b0aacc4dac6c', 'func/funclist.do', null);
INSERT INTO `t_function` VALUES ('1c1b0c17-af00-4f0f-9273-288e71c8214a', '角色管理', null, '46877307-f33c-4325-9e57-b0aacc4dac6c', 'role/rolelist.do \r\n\r\n', null);
INSERT INTO `t_function` VALUES ('2011db4e-5dbb-4f6a-9062-80a13bc8d906', '系统模块', null, '909b6004-1699-46b2-a30a-390c7545638e', 'dept/deptlist.do', null);
INSERT INTO `t_function` VALUES ('46877307-f33c-4325-9e57-b0aacc4dac6c', '系统管理', null, '0', '', '2');
INSERT INTO `t_function` VALUES ('909b6004-1699-46b2-a30a-390c7545638e', '接口维护', null, '0', '', '1');
INSERT INTO `t_function` VALUES ('c4cd7878-a890-44b0-96a3-fba609c8dd24', '用例维护', null, '909b6004-1699-46b2-a30a-390c7545638e', 'case/caselist.do', '1');

-- ----------------------------
-- Table structure for `t_result`
-- ----------------------------
DROP TABLE IF EXISTS `t_result`;
CREATE TABLE `t_result` (
  `runtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `sucess` int(11) DEFAULT NULL,
  `fail` int(11) DEFAULT NULL,
  `skip` int(11) DEFAULT NULL,
  PRIMARY KEY (`runtime`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_result
-- ----------------------------
INSERT INTO `t_result` VALUES ('2017-10-14 17:26:04', '1', '1', null);
INSERT INTO `t_result` VALUES ('2017-10-14 17:30:07', '1', '1', null);
INSERT INTO `t_result` VALUES ('2017-10-14 17:36:07', '1', '1', null);
INSERT INTO `t_result` VALUES ('2017-10-14 17:38:04', '1', '1', null);
INSERT INTO `t_result` VALUES ('2017-10-14 17:40:04', '1', '1', null);
INSERT INTO `t_result` VALUES ('2018-03-24 20:30:30', '0', '2', null);
INSERT INTO `t_result` VALUES ('2018-03-24 20:46:25', '0', '2', null);
INSERT INTO `t_result` VALUES ('2018-03-24 20:55:00', '0', '2', null);
INSERT INTO `t_result` VALUES ('2018-03-24 21:00:01', '0', '2', null);
INSERT INTO `t_result` VALUES ('2018-03-24 21:05:01', '0', '2', null);
INSERT INTO `t_result` VALUES ('2018-03-24 21:10:01', '1', '1', null);
INSERT INTO `t_result` VALUES ('2018-03-24 21:20:01', '1', '1', null);

-- ----------------------------
-- Table structure for `t_result_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_result_detail`;
CREATE TABLE `t_result_detail` (
  `runtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `caseId` varchar(64) NOT NULL,
  `result` varchar(2) DEFAULT NULL,
  `detailmsg` longtext,
  `taketime` bigint(20) DEFAULT NULL,
  `system` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`runtime`,`caseId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_result_detail
-- ----------------------------
INSERT INTO `t_result_detail` VALUES ('2017-10-14 17:26:04', '653e3a61-5670-4023-85a9-66d0fd95c268', 'Y', null, '565', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2017-10-14 17:30:07', '653e3a61-5670-4023-85a9-66d0fd95c268', 'Y', null, '574', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2017-10-14 17:36:07', '653e3a61-5670-4023-85a9-66d0fd95c268', 'Y', 'test', '558', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2017-10-14 17:36:07', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'test', '19', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2017-10-14 17:38:04', '653e3a61-5670-4023-85a9-66d0fd95c268', 'Y', null, '569', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2017-10-14 17:38:04', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'Syntax error:Aviator doesn\'t support assignment at 6, current token: [type=\'Number\',lexeme=\'2\',index=5]', '19', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2017-10-14 17:40:04', '653e3a61-5670-4023-85a9-66d0fd95c268', 'Y', null, '20', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2017-10-14 17:40:04', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'Syntax error:Aviator doesn\'t support assignment at 6, current token: [type=\'Number\',lexeme=\'2\',index=5]', '17', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 20:30:30', '653e3a61-5670-4023-85a9-66d0fd95c268', 'N', 'json string can not be null or empty', '181', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 20:30:30', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'json string can not be null or empty', '0', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 20:46:25', '653e3a61-5670-4023-85a9-66d0fd95c268', 'N', 'json string can not be null or empty', '2080', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 20:46:25', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'json string can not be null or empty', '551', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 20:55:00', '653e3a61-5670-4023-85a9-66d0fd95c268', 'N', 'json string can not be null or empty', '120', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 20:55:00', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'json string can not be null or empty', '10', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 21:00:01', '653e3a61-5670-4023-85a9-66d0fd95c268', 'N', 'json string can not be null or empty', '0', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 21:00:01', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'json string can not be null or empty', '0', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 21:05:01', '653e3a61-5670-4023-85a9-66d0fd95c268', 'N', 'json string can not be null or empty', '0', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 21:05:01', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'json string can not be null or empty', '0', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 21:10:01', '653e3a61-5670-4023-85a9-66d0fd95c268', 'Y', null, '741', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 21:10:01', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'Syntax error:Aviator doesn\'t support assignment at 6, current token: [type=\'Number\',lexeme=\'2\',index=5]', '10', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 21:20:01', '653e3a61-5670-4023-85a9-66d0fd95c268', 'Y', null, '754', '1100071d-7cdf-434a-bb12-601afa3c0768');
INSERT INTO `t_result_detail` VALUES ('2018-03-24 21:20:01', '653e3a61-5670-4023-85a9-66d0fd95c267', 'N', 'Syntax error:Aviator doesn\'t support assignment at 6, current token: [type=\'Number\',lexeme=\'2\',index=5]', '8', '1100071d-7cdf-434a-bb12-601afa3c0768');

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `roleid` varchar(64) NOT NULL,
  `rolename` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('238d2ef4-4a00-4851-b719-fcf22968fa51', '测试人员', '具有接口维护权限', 'super');
INSERT INTO `t_role` VALUES ('48990dc2-019b-4c8e-882f-b90a520c7ab9', '一般用户', '拥有部分权限', null);
INSERT INTO `t_role` VALUES ('7efe8c91-f269-4761-b1ee-ce29c9a8c3d1', 'superadmin', '123', 'super');
INSERT INTO `t_role` VALUES ('9d6471b4-2f67-4a02-be9c-290eacb9617b', '客服', '客服权限', '2');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userid` varchar(64) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  `roleid` varchar(64) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `bianhao` varchar(64) DEFAULT NULL,
  `status` int(5) DEFAULT '1',
  `email` varchar(64) DEFAULT '',
  `code` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('5aecebaa-d0d7-4ee9-99d6-62cf6bcaffc6', 'test', '$1$qiLhoNvb$u3Dy4y1fQt34uo0s2SJZ1.', '1234', '1234', '1234', '238d2ef4-4a00-4851-b719-fcf22968fa51', '1234', 'test', '1', null, null);
INSERT INTO `t_user` VALUES ('f9eef08f-830c-44c0-833a-90060663be85', 'admin', '$1$vZcxsXDq$Zmf3aliEnzaUOEEaMh0.w0', '超级管理员', '男', '北京', '7efe8c91-f269-4761-b1ee-ce29c9a8c3d1', '拥有一切权限', '1001', '1', '', null);
