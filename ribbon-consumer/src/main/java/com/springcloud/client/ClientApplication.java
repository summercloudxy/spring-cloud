�}��    �5��`9e��$���$��R��=�)sD _��g���A���8��Ԙ>�P��BA2Q�h�"����s!�U3�Eq�s�fF�]�s1��,�D�,�7�F���K�SSl2S��MA��fy8�`֜�#��
��lV��N�^;��
�^TʅȖ�X �D�
PEP�vsχq��>,���g1�
I:��l��VJ�V�[���b���Ǫ�On�)����T�q]ߤ�/���f�7��R���w.�V�پ�-�f�Ϋ	����`�Y�HYsˀo&.B�q\�����'m��%�P@����|)F�Мo�z�۵J-E������r0�x��Kv�F��YwfX�_ս��b=/_� U��X��eDj�v�Ogi3c�Sf���nD��
��S�h��4���F��I|�'o���Y�a�w�o��B��{��Iܠ�O�鞰�yG<���/�H�}�,�!Ca���}�<-��Ly������0YX��Y�g���ؙ�'lD'�G��׶n��Sá�X�b�4I��bV>؇��f��@��n���D���(x C���ާ:�<��C�C�,�J������\ô�\�Q�>����[���1M<b�>�:��(��?kɵ3J]P��V=�Y���y���1��X)f�d�Z���,>h��~�Jg��!�ϴ�Pp���|������ǚY؞�����,�#Nd�cژ$��3�\��4�4���쟘"QO�n�����A�b��b�8ry�
2�^��:a����g!���͜�<>q���L�_�n�p�4�����Jց�������k�E��+ �S�Dֶ�n���k�{��q-6U����Otmȃ���*�8��hX<2���y�\۷N
�:�R'iQ��)�ޯ<��p�ƳM..��8�������̭����V*���o�A�ׯ� 2$�S(���^)ض���9e�V�^��eG�Qc�YRZsO�t���y(�\��J5I�^��SV�"R�,�d}d�,Bean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
