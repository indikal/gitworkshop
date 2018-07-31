----------------------------------------------------------------------------------------------------------------------
-- Alterscript for ebhelp schema by component: ebscmetadata
----------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
-- Here goes all generic modifications that apply to all mecp instances, i.e. no customer specific data or configuration.
--START-GENERIC-PART

--END-GENERIC-PART

------------------------------------------------------------------------------------------------------------------------
-- Here goes modifiactions that adhere to a specific mecp instans and/or customer specific data and configuration.
--START-SPECIFIC-PART

--END-SPECIFIC-PART

------------------------------------------------------------------------------------------------------------------------
-- Version part - This part is for updating the version table. DO NOT MODIFY!! THIS PART WILL BE SET AUTMATICALLY
------------------------------------------------------------------------------------------------------------------------
UPDATE glxVersion SET DBSchemaVersion = '##VERSION##', changeDate = SYSDATE WHERE module = 'ebhelp';