�}��    ��CW��`��$���$��R���)s��?p*ֹi�Ԟ}���}@���]f�����O��Df������q�N���k1�*�Jǂ��V���^������q�*θ�?���Z2K������o_��&i��C��g�xޅw`�S.	k����\={�U�>e��ey|�?���^:r��7轏�ώ�զ����	��D���u�W"d����&���"f���W"��7��R���w.�V�پ�-�f�Ϋ	����`�Y�HYsˀo&.B�q\�����'m��%�P@����|)F�Мo�z�۵J-E������r0�x��Kv�F��YwfX�_ս��b=/_� U��X��eDj�v�Ogi3c�Sf���nD��
��S�h��4���F��I|�'o���Y�a�w�o��B��{��Iܠ�O�鞰�yG<���/�H�}�,�!Ca���}�<-��Ly������0YX��Y�g���ؙ�'l*|=\ ��:w�%��G�E����6`��$+Lx>o:]k�����s��I��A���ꩁj���l�{��m62e~f���� {B+��:s��@#u�خ5?#��!��%��tiR?�4H���9�7�PF�H�)��[
�_vQ�{xʿ��?��o��y��c�{kfo��\R�Jo��72�e+��C�2&��4?7���6�L�t�KkMxD.��qUW	LB��_��:��2��c�X�k5�.�����$V#Q8$ӻS�Ξ1�ݔu��I-|ڪ@6'�߰w4|��iͤp�u�@�s���~f� �1���ҁ�Sv�������|Ժ"�o��bHf�ɡ���+Y�K���w�-��T?�Wş/�0#��t�NLZ�U_*��@�^�;T�?�6{e��Wt�B�^��D��0&8%����:^��Z���@��O�9\�,!m�1���^��^�(���EW q?��+|�4UXs�H�49�.ҭ��	�d�
�lD.	"A��T��^K>���Ƭ�GT�v@��������;���3���NiQ�����bKO@�rȪ>C�{d8��dԘ�:>_S<Q� �x�~�~�鶼=Cde�%�x����^�)\?)Y5b-�UA�J���l�k�� 8]<@���|^Cw��;�c�C�WTz�ߑv�zLU����AS�4��qJ�!I"�i�$d������ �-�E�Frj��]U-&�*N�C^�[�26D��)��W����7�>m�5�2��oB���}��aP�S/oZ�ߙS��g��jZC���k��΃��tq��T�XԆ�#�*T!��W�e�F��A1��$[��].Tq�H@���uV��oɦB����Y���SM���t��@�,[���t
N��T�5��h�]�i���q��s�T�)�Uk�4��Ck�e��O���/':����V��������@��hJNf4�`�MTM�F�V}-�r�d�X���yx%M���C&G2
��8-��O]questMapping(value= "/hello2", method= RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
            return new User(name, age);
    }

            @RequestMapping(value= "/hello3", method = RequestMethod.POST)
            public String hello(@RequestBody User user){
                return "Hello " + user.getName() + ", " + user.getAge();
            }
}
