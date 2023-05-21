import "./Login.scss";
import {useState} from "react";
import axios from "axios";

const Login = ()=>{
    const [inputUserId, setInputUserId] = useState("");
    const [inputUserPass, setInputUserPass] = useState("");
    const onChangeId = (e : any)=>{
        setInputUserId(e.target.value);
    }
    const onChangePass = (e : any)=>{
        setInputUserPass(e.target.value);
    }
    const onClick = ()=>{
        console.log(inputUserId, inputUserPass)
        axios.post("/api/login", {inputUserId:inputUserId, inputUserPass:inputUserPass})
            .then((res:any)=>{
                console.log("axios 호출 성공");
                console.log("result : "+res.data.testvalue);
            });
    }
    return (
      <div className={"LoginPage"}>
        <div className={"loginSection"}>
            <div>

            </div>
            <h1>
                Mr.Hometender
            </h1>
            <div>
                <input type={"text"} onChange={onChangeId} maxLength={15} placeholder={"ID"}/>
                <input type={"password"} onChange={onChangePass} maxLength={15} placeholder={"PASS"}/>
                <button onClick={onClick}>로그인</button>
                <p>아이디 찾기 | 패스워드 찾기</p>
            </div>
        </div>
      </div>
    );
}
export default Login;